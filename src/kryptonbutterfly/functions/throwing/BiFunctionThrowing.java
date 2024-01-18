package kryptonbutterfly.functions.throwing;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface BiFunctionThrowing<U, V, R, E extends Throwable> extends ApplicableRight<V, FunctionThrowing<U, R, E>>, ApplicableLeft<U, FunctionThrowing<V, R, E>>
{
	R apply(U u, V v) throws E;
	
	@Override
	default FunctionThrowing<U, R, E> aptLast(V v)
	{
		return u -> apply(u, v);
	}
	
	@Override
	default FunctionThrowing<V, R, E> aptFirst(U u)
	{
		return v -> apply(u, v);
	}
}