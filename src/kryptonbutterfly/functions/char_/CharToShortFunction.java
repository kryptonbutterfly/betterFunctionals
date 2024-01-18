package kryptonbutterfly.functions.char_;

import kryptonbutterfly.functions.char_.applicable.CharApplicableLeft;
import kryptonbutterfly.functions.char_.applicable.CharApplicableRight;
import kryptonbutterfly.functions.short_.ShortSupplier;

@FunctionalInterface
public interface CharToShortFunction extends CharApplicableLeft<ShortSupplier>, CharApplicableRight<ShortSupplier>
{
	short apply(char a);
	
	@Override
	default ShortSupplier aptFirst(char a)
	{
		return aptLast(a);
	}
	
	@Override
	default ShortSupplier aptLast(char z)
	{
		return () -> apply(z);
	}
}