package kryptonbutterfly.functions.throwing;

import java.util.Objects;
import java.util.function.Predicate;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface PredicateThrowing<T, E extends Throwable> extends ApplicableRight<T, RunnableThrowing<E>>, ApplicableLeft<T, RunnableThrowing<E>>
{
	boolean test(T t) throws E;
	
	default PredicateThrowing<T, E> and(PredicateThrowing<? super T, E> other)
	{
		Objects.requireNonNull(other);
		return t -> test(t) && other.test(t);
	}
	
	default PredicateThrowing<T, E> and(Predicate<? super T> other)
	{
		return t -> test(t) && other.test(t);
	}
	
	default PredicateThrowing<T, E> negate()
	{
		return t -> !test(t);
	}
	
	default PredicateThrowing<T, E> or(PredicateThrowing<? super T, E> other)
	{
		Objects.requireNonNull(other);
		return t -> test(t) || other.test(t);
	}
	
	default PredicateThrowing<T, E> or(Predicate<? super T> other)
	{
		Objects.requireNonNull(other);
		return t -> test(t) || other.test(t);
	}
	
	@Override
	default RunnableThrowing<E> aptLast(T t)
	{
		return () -> test(t);
	}
	
	@Override
	default RunnableThrowing<E> aptFirst(T t)
	{
		return aptLast(t);
	}
}