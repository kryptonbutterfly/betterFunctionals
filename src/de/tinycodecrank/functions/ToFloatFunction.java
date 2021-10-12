package de.tinycodecrank.functions;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;
import de.tinycodecrank.functions.float_.FloatSupplier;

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