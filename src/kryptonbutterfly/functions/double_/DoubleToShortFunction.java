package kryptonbutterfly.functions.double_;

import kryptonbutterfly.functions.double_.applicable.DoubleApplicableLeft;
import kryptonbutterfly.functions.double_.applicable.DoubleApplicableRight;
import kryptonbutterfly.functions.short_.ShortSupplier;

@FunctionalInterface
public interface DoubleToShortFunction extends DoubleApplicableLeft<ShortSupplier>, DoubleApplicableRight<ShortSupplier>
{
	short apply(double a);
	
	@Override
	default ShortSupplier aptFirst(double a)
	{
		return aptLast(a);
	}
	
	@Override
	default ShortSupplier aptLast(double z)
	{
		return () -> apply(z);
	}
}