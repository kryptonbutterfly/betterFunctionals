package de.tinycodecrank.functions.throwing;

import java.util.Objects;
import java.util.function.BiPredicate;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface BiPredicateThrowing<T, U, E extends Throwable> extends ApplicableRight<U, PredicateThrowing<T, E>>, ApplicableLeft<T, PredicateThrowing<U, E>>
{
	boolean test(T t, U u) throws E;
	
	default BiPredicateThrowing<T, U, E> and(BiPredicateThrowing<? super T, ? super U, E> other)
	{
		Objects.requireNonNull(other);
		return (T t, U u) -> test(t, u) && other.test(t, u);
	}
	
	default BiPredicateThrowing<T, U, E> and(BiPredicate<? super T, ? super U> other)
	{
		Objects.requireNonNull(other);
		return (T t, U u) -> test(t, u) && other.test(t, u);
	}
	
	default BiPredicateThrowing<T, U, E> negate()
	{
		return (T t, U u) -> !test(t, u);
	}
	
	default BiPredicateThrowing<T, U, E> or(BiPredicateThrowing<? super T, ? super U, E> other)
	{
		Objects.requireNonNull(other);
		return (T t, U u) -> test(t, u) || other.test(t, u);
	}
	
	default BiPredicateThrowing<T, U, E> or(BiPredicate<? super T, ? super U> other)
	{
		Objects.requireNonNull(other);
		return (T t, U u) -> test(t, u) || other.test(t, u);
	}
	
	@Override
	default PredicateThrowing<T, E> aptLast(U u)
	{
		return t -> test(t, u);
	}
	
	@Override
	default PredicateThrowing<U, E> aptFirst(T t)
	{
		return u -> test(t, u);
	}
}