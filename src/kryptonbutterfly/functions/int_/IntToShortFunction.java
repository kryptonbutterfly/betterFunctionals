package kryptonbutterfly.functions.int_;

import kryptonbutterfly.functions.int_.applicable.IntApplicableLeft;
import kryptonbutterfly.functions.int_.applicable.IntApplicableRight;
import kryptonbutterfly.functions.short_.ShortSupplier;

@FunctionalInterface
public interface IntToShortFunction extends IntApplicableLeft<ShortSupplier>, IntApplicableRight<ShortSupplier>
{
	short apply(int a);
	
	@Override
	default ShortSupplier aptFirst(int a)
	{
		return aptLast(a);
	}
	
	@Override
	default ShortSupplier aptLast(int z)
	{
		return () -> apply(z);
	}
}