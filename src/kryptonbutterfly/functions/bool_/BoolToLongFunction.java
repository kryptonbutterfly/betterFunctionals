package kryptonbutterfly.functions.bool_;

import java.util.function.LongSupplier;

import kryptonbutterfly.functions.bool_.applicable.BoolApplicableLeft;
import kryptonbutterfly.functions.bool_.applicable.BoolApplicableRight;

@FunctionalInterface
public interface BoolToLongFunction extends BoolApplicableLeft<LongSupplier>, BoolApplicableRight<LongSupplier>
{
	long apply(boolean a);
	
	@Override
	default LongSupplier aptFirst(boolean a)
	{
		return aptLast(a);
	}
	
	@Override
	default LongSupplier aptLast(boolean z)
	{
		return () -> apply(z);
	}
}