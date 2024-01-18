package kryptonbutterfly.functions.long_;

import kryptonbutterfly.functions.long_.applicable.LongApplicableLeft;
import kryptonbutterfly.functions.long_.applicable.LongApplicableRight;
import kryptonbutterfly.functions.short_.ShortSupplier;

@FunctionalInterface
public interface LongToShortFunction extends LongApplicableLeft<ShortSupplier>, LongApplicableRight<ShortSupplier>
{
	short apply(long a);
	
	@Override
	default ShortSupplier aptFirst(long a)
	{
		return aptLast(a);
	}
	
	@Override
	default ShortSupplier aptLast(long z)
	{
		return () -> apply(z);
	}
}