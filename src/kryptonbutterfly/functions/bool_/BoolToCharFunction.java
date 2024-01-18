package kryptonbutterfly.functions.bool_;

import kryptonbutterfly.functions.bool_.applicable.BoolApplicableLeft;
import kryptonbutterfly.functions.bool_.applicable.BoolApplicableRight;
import kryptonbutterfly.functions.char_.CharSupplier;

@FunctionalInterface
public interface BoolToCharFunction extends BoolApplicableLeft<CharSupplier>, BoolApplicableRight<CharSupplier>
{
	char apply(boolean a);
	
	@Override
	default CharSupplier aptFirst(boolean a)
	{
		return aptLast(a);
	}
	
	@Override
	default CharSupplier aptLast(boolean z)
	{
		return () -> apply(z);
	}
}