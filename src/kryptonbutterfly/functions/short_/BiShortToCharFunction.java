package kryptonbutterfly.functions.short_;

import kryptonbutterfly.functions.short_.applicable.ShortApplicableLeft;
import kryptonbutterfly.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface BiShortToCharFunction extends ShortApplicableLeft<ShortToCharFunction>, ShortApplicableRight<ShortToCharFunction>
{
	char apply(short a, short b);
	
	@Override
	default ShortToCharFunction aptFirst(short a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default ShortToCharFunction aptLast(short b)
	{
		return a -> apply(a, b);
	}
}