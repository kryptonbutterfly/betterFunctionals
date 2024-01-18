package kryptonbutterfly.functions.float_;

import kryptonbutterfly.functions.byte_.ByteSupplier;
import kryptonbutterfly.functions.float_.applicable.FloatApplicableLeft;
import kryptonbutterfly.functions.float_.applicable.FloatApplicableRight;

@FunctionalInterface
public interface FloatToByteFunction extends FloatApplicableLeft<ByteSupplier>, FloatApplicableRight<ByteSupplier>
{
	byte apply(float a);

	@Override
	default ByteSupplier aptFirst(float a)
	{
		return aptLast(a);
	}
	
	@Override
	default ByteSupplier aptLast(float z)
	{
		return () -> apply(z);
	}
}