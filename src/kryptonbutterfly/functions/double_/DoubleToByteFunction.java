package kryptonbutterfly.functions.double_;

import kryptonbutterfly.functions.byte_.ByteSupplier;
import kryptonbutterfly.functions.double_.applicable.DoubleApplicableLeft;
import kryptonbutterfly.functions.double_.applicable.DoubleApplicableRight;

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