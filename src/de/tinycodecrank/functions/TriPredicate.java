package de.tinycodecrank.functions;

import java.util.Objects;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface TriPredicate<T, U, V> extends ApplicableLeft<T, BiPredicate<U, V>>, ApplicableRight<V, BiPredicate<T, U>>
{
	boolean test(T t, U u, V v);
	
	default TriPredicate<T, U, V> and(TriPredicate<? super T, ? super U, ? super V> other)
	{
		Objects.requireNonNull(other);
		return (T t, U u, V v) -> test(t, u, v) && other.test(t, u, v);
	}
	
	default TriPredicate<T, U, V> negate()
	{
		return (T t, U u, V v) -> !test(t, u, v);
	}
	
	default TriPredicate<T, U, V> or(TriPredicate<? super T, ? super U, ? super V> other)
	{
		Objects.requireNonNull(other);
		return (T t, U u, V v) -> test(t, u, v) || other.test(t, u, v);
	}
	
	@Override
	default BiPredicate<U, V> aptFirst(T t)
	{
		return (U u, V v) -> test(t, u, v);
	}
	
	@Override
	default BiPredicate<T, U> aptLast(V v)
	{
		return (T t, U u) -> test(t, u, v);
	}
}