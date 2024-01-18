package kryptonbutterfly.functions.throwing;

import java.util.Objects;
import java.util.function.Consumer;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.applicable.ApplicableRight;

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
	
	/**
	 * @return a Function that accepts an argument and does nothing
	 */
	@SuppressWarnings("unchecked")
	public static <T, E extends Throwable> ConsumerThrowing<T, E> sink()
	{
		return (ConsumerThrowing<T, E>) SINK;
	}
	
	static final ConsumerThrowing<?, ?> SINK = a ->
	{};
}