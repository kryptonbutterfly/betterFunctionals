package de.tinycodecrank.functions;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface TriPredicate<T, U, V> extends ApplicableLeft<T, BiPredicate<U, V>>, ApplicableRight<V, BiPredicate<T, U>>
{
	boolean test(T t, U u, V v);
	
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