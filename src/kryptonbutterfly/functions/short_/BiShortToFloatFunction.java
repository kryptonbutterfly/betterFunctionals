package kryptonbutterfly.functions.short_;

import kryptonbutterfly.functions.short_.applicable.ShortApplicableLeft;
import kryptonbutterfly.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface BiShortToFloatFunction extends ShortApplicableLeft<ShortToFloatFunction>, ShortApplicableRight<ShortToFloatFunction>
{
	float apply(short a, short b);
	
	@Override
	default ShortToFloatFunction aptFirst(short a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default ShortToFloatFunction aptLast(short b)
	{
		return a -> apply(a, b);
	}
}