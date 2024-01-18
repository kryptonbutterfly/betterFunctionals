package kryptonbutterfly.functions.long_;

import kryptonbutterfly.functions.float_.FloatSupplier;
import kryptonbutterfly.functions.long_.applicable.LongApplicableLeft;
import kryptonbutterfly.functions.long_.applicable.LongApplicableRight;

@FunctionalInterface
public interface LongToFloatFunction extends LongApplicableLeft<FloatSupplier>, LongApplicableRight<FloatSupplier>
{
	float apply(long a);
	
	@Override
	default FloatSupplier aptFirst(long a)
	{
		return aptLast(a);
	}
	
	@Override
	default FloatSupplier aptLast(long z)
	{
		return () -> apply(z);
	}
}