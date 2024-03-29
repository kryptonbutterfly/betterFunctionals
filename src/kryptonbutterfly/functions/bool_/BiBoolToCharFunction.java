package kryptonbutterfly.functions.bool_;

import kryptonbutterfly.functions.bool_.applicable.BoolApplicableLeft;
import kryptonbutterfly.functions.bool_.applicable.BoolApplicableRight;

@FunctionalInterface
public interface BiBoolToCharFunction extends BoolApplicableLeft<BoolToCharFunction>, BoolApplicableRight<BoolToCharFunction>
{
	char apply(boolean a, boolean b);
	
	@Override
	default BoolToCharFunction aptFirst(boolean a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default BoolToCharFunction aptLast(boolean b)
	{
		return a -> apply(a, b);
	}
}