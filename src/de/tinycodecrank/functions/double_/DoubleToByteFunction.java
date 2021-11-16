package de.tinycodecrank.functions.double_;

import de.tinycodecrank.functions.byte_.ByteSupplier;
import de.tinycodecrank.functions.double_.applicable.DoubleApplicableLeft;
import de.tinycodecrank.functions.double_.applicable.DoubleApplicableRight;

@FunctionalInterface
public interface DoubleToByteFunction extends DoubleApplicableLeft<ByteSupplier>, DoubleApplicableRight<ByteSupplier>
{
	byte apply(double a);
	
	@Override
	default ByteSupplier aptFirst(double a)
	{
		return aptLast(a);
	}

	@Override
	default ByteSupplier aptLast(double z)
	{
		return () -> apply(z);
	}
}