package de.tinycodecrank.functions.byte_;

import de.tinycodecrank.functions.byte_.applicable.ByteApplicableLeft;
import de.tinycodecrank.functions.byte_.applicable.ByteApplicableRight;
import de.tinycodecrank.functions.float_.FloatSupplier;

@FunctionalInterface
public interface ByteToFloatFunction extends ByteApplicableLeft<FloatSupplier>, ByteApplicableRight<FloatSupplier>
{
	float apply(byte a);
	
	@Override
	default FloatSupplier aptFirst(byte a)
	{
		return aptLast(a);
	}
	
	@Override
	default FloatSupplier aptLast(byte z)
	{
		return () -> apply(z);
	}
}