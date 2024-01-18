package kryptonbutterfly.functions.float_;

import kryptonbutterfly.functions.float_.applicable.FloatApplicableLeft;
import kryptonbutterfly.functions.float_.applicable.FloatApplicableRight;

@FunctionalInterface
public interface BiFloatToLongFunction extends FloatApplicableLeft<FloatToLongFunction>, FloatApplicableRight<FloatToLongFunction>
{
	long apply(float a, float b);
	
	@Override
	default FloatToLongFunction aptFirst(float a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default FloatToLongFunction aptLast(float b)
	{
		return a -> apply(a, b);
	}
}