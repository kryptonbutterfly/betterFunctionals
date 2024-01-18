package kryptonbutterfly.functions.short_;

import kryptonbutterfly.functions.short_.applicable.ShortApplicableLeft;
import kryptonbutterfly.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface BiShortToLongFunction extends ShortApplicableLeft<ShortToLongFunction>, ShortApplicableRight<ShortToLongFunction>
{
	long apply(short a, short b);
	
	@Override
	default ShortToLongFunction aptFirst(short a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default ShortToLongFunction aptLast(short b)
	{
		return a -> apply(a, b);
	}
}