package kryptonbutterfly.functions.bool_;

import kryptonbutterfly.functions.bool_.applicable.BoolApplicableLeft;
import kryptonbutterfly.functions.bool_.applicable.BoolApplicableRight;
import kryptonbutterfly.functions.short_.ShortSupplier;

@FunctionalInterface
public interface BoolToShortFunction extends BoolApplicableLeft<ShortSupplier>, BoolApplicableRight<ShortSupplier>
{
	short apply(boolean a);
	
	@Override
	default ShortSupplier aptFirst(boolean a)
	{
		return aptLast(a);
	}
	
	@Override
	default ShortSupplier aptLast(boolean z)
	{
		return () -> apply(z);
	}
}