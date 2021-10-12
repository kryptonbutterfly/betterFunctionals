package de.tinycodecrank.functions.throwing;

import java.util.Objects;
import java.util.function.Consumer;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface ConsumerThrowing<T, E extends Throwable> extends ApplicableRight<T, RunnableThrowing<E>>, ApplicableLeft<T, RunnableThrowing<E>>
{
	void accept(T t) throws E;
	
	default ConsumerThrowing<T, E> andThen(ConsumerThrowing<? super T, E> after)
	{
		Objects.requireNonNull(after);
		return (T t) ->
		{
			accept(t);
			after.accept(t);
		};
	}
	
	default ConsumerThrowing<T, E> andThen(Consumer<? super T> after)
	{
		Objects.requireNonNull(after);
		return (T t) ->
		{
			accept(t);
			after.accept(t);
		};
	}
	
	@Override
	default RunnableThrowing<E> aptLast(T t)
	{
		return () -> accept(t);
	}
	
	@Override
	default RunnableThrowing<E> aptFirst(T t)
	{
		return aptLast(t);
	}
}