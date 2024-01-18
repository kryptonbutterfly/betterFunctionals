package kryptonbutterfly.functions.float_;

import kryptonbutterfly.functions.float_.applicable.FloatApplicableLeft;
import kryptonbutterfly.functions.float_.applicable.FloatApplicableRight;
import kryptonbutterfly.functions.short_.ShortSupplier;

@FunctionalInterface
public interface FloatToShortFunction extends FloatApplicableLeft<ShortSupplier>, FloatApplicableRight<ShortSupplier>
{
	short apply(float a);
	
	@Override
	default ShortSupplier aptFirst(float a)
	{
		return aptLast(a);
	}
	
	@Override
	default ShortSupplier aptLast(float z)
	{
		return () -> apply(z);
	}
}