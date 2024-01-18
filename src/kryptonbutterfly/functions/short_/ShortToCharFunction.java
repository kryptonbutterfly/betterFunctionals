package kryptonbutterfly.functions.short_;

import kryptonbutterfly.functions.char_.CharSupplier;
import kryptonbutterfly.functions.short_.applicable.ShortApplicableLeft;
import kryptonbutterfly.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface ShortToCharFunction extends ShortApplicableLeft<CharSupplier>, ShortApplicableRight<CharSupplier>
{
	char apply(short a);
	
	@Override
	default CharSupplier aptFirst(short a)
	{
		return aptLast(a);
	}
	
	@Override
	default CharSupplier aptLast(short z)
	{
		return () -> apply(z);
	}
}