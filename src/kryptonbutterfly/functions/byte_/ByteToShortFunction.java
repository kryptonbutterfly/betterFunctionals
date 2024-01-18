package kryptonbutterfly.functions.byte_;

import kryptonbutterfly.functions.byte_.applicable.ByteApplicableLeft;
import kryptonbutterfly.functions.byte_.applicable.ByteApplicableRight;
import kryptonbutterfly.functions.short_.ShortSupplier;

@FunctionalInterface
public interface ByteToShortFunction extends ByteApplicableLeft<ShortSupplier>, ByteApplicableRight<ShortSupplier>
{
	short apply(byte a);
	
	@Override
	default ShortSupplier aptFirst(byte a)
	{
		return aptLast(a);
	}
	
	@Override
	default ShortSupplier aptLast(byte z)
	{
		return () -> apply(z);
	}
}