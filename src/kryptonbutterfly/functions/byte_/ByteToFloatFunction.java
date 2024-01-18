package kryptonbutterfly.functions.byte_;

import kryptonbutterfly.functions.byte_.applicable.ByteApplicableLeft;
import kryptonbutterfly.functions.byte_.applicable.ByteApplicableRight;
import kryptonbutterfly.functions.float_.FloatSupplier;

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