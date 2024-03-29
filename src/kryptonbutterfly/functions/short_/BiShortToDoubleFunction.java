package kryptonbutterfly.functions.short_;

import kryptonbutterfly.functions.short_.applicable.ShortApplicableLeft;
import kryptonbutterfly.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface BiShortToDoubleFunction extends ShortApplicableLeft<ShortToDoubleFunction>, ShortApplicableRight<ShortToDoubleFunction>
{
	double apply(short a, short b);
	
	@Override
	default ShortToDoubleFunction aptFirst(short a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default ShortToDoubleFunction aptLast(short b)
	{
		return a -> apply(a, b);
	}
}