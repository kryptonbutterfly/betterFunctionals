package kryptonbutterfly.functions.throwing;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface BiConsumerThrowing<U, V, E extends Throwable> extends ApplicableRight<V, ConsumerThrowing<U, E>>, ApplicableLeft<U, ConsumerThrowing<V, E>>
{
	void accept(U u, V v) throws E;
	
	@Override
	default ConsumerThrowing<U, E> aptLast(V v)
	{
		return u -> accept(u, v);
	}
	
	@Override
	default ConsumerThrowing<V, E> aptFirst(U u)
	{
		return v -> accept(u, v);
	}
	
	/**
	 * @return a Function that accepts two arguments and does nothing
	 */
	@SuppressWarnings("unchecked")
	public static <U, V, E extends Throwable> BiConsumerThrowing<U, V, E> sink()
	{
		return (BiConsumerThrowing<U, V, E>) SINK;
	}
	
	static final BiConsumerThrowing<?, ?, ?> SINK = (a, b) ->
	{};
}