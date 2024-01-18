package kryptonbutterfly.functions.bool_;

import kryptonbutterfly.functions.bool_.applicable.BoolApplicableLeft;
import kryptonbutterfly.functions.bool_.applicable.BoolApplicableRight;

@FunctionalInterface
public interface BiBoolToShortFunction extends BoolApplicableLeft<BoolToShortFunction>, BoolApplicableRight<BoolToShortFunction>
{
	short apply(boolean a, boolean b);
	
	@Override
	default BoolToShortFunction aptFirst(boolean a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default BoolToShortFunction aptLast(boolean b)
	{
		return a -> apply(a, b);
	}
}