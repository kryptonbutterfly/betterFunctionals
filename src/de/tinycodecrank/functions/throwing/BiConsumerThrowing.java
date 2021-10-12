package de.tinycodecrank.functions.throwing;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;

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
}