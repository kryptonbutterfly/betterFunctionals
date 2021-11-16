package de.tinycodecrank.functions;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;
import de.tinycodecrank.functions.byte_.ByteSupplier;

@FunctionalInterface
public interface ToByteFunction<T> extends ApplicableLeft<T, ByteSupplier>, ApplicableRight<T, ByteSupplier>
{
	byte apply(T a);
	
	@Override
	default ByteSupplier aptFirst(T t)
	{
		return aptLast(t);
	}
	
	@Override
	default ByteSupplier aptLast(T t)
	{
		return () -> apply(t);
	}
}