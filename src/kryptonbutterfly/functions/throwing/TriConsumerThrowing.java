package kryptonbutterfly.functions.throwing;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface TriConsumerThrowing<U, V, W, E extends Throwable> extends ApplicableRight<W, BiConsumerThrowing<U, V, E>>, ApplicableLeft<U, BiConsumerThrowing<V, W, E>>
{
	void accept(U u, V v, W w) throws E;
	
	@Override
	default BiConsumerThrowing<U, V, E> aptLast(W w)
	{
		return (u, v) -> accept(u, v, w);
	}
	
	@Override
	default BiConsumerThrowing<V, W, E> aptFirst(U u)
	{
		return (v, w) -> accept(u, v, w);
	}
}