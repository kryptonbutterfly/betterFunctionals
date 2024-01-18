package kryptonbutterfly.functions;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.applicable.ApplicableRight;
import kryptonbutterfly.functions.float_.FloatSupplier;

@FunctionalInterface
public interface ToFloatFunction<V> extends ApplicableLeft<V, FloatSupplier>, ApplicableRight<V, FloatSupplier>
{
	float apply(V v);
	
	@Override
	default FloatSupplier aptFirst(V a)
	{
		return () -> apply(a);
	}
	
	@Override
	default FloatSupplier aptLast(V z)
	{
		return () -> apply(z);
	}
}