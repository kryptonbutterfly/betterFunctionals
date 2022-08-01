package de.tinycodecrank.functions.void_;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface TriConsumer<T, U, V> extends ApplicableRight<V, BiConsumer_<T, U>>, ApplicableLeft<T, BiConsumer_<U, V>>
{
	public void accept(T t, U u, V v);
	
	@Override
	default BiConsumer_<T, U> aptLast(V v)
	{
		return (t, u) -> accept(t, u, v);
	}
	
	@Override
	default BiConsumer_<U, V> aptFirst(T t)
	{
		return (u, v) -> accept(t, u, v);
	}
	
	/**
	 * @return a Function that accepts three arguments and does nothing
	 */
	@SuppressWarnings("unchecked")
	public static <T, U, V> TriConsumer<T, U, V> sink()
	{
		return (TriConsumer<T, U, V>) SINK;
	}
	
	static final TriConsumer<?, ?, ?> SINK = (a, b, c) ->
	{};
}