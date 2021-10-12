package de.tinycodecrank.functions;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface TriConsumer<T, U, V> extends ApplicableRight<V, BiConsumer<T, U>>, ApplicableLeft<T, BiConsumer<U, V>>
{
	public void accept(T t, U u, V v);
	
	@Override
	default BiConsumer<T, U> aptLast(V v)
	{
		return (t, u) -> accept(t, u, v);
	}
	
	@Override
	default BiConsumer<U, V> aptFirst(T t)
	{
		return (u, v) -> accept(t, u, v);
	}
}