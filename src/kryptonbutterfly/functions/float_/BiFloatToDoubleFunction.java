package kryptonbutterfly.functions.float_;

import kryptonbutterfly.functions.float_.applicable.FloatApplicableLeft;
import kryptonbutterfly.functions.float_.applicable.FloatApplicableRight;

@FunctionalInterface
public interface BiFloatToDoubleFunction extends FloatApplicableLeft<FloatToDoubleFunction>, FloatApplicableRight<FloatToDoubleFunction>
{
	double apply(float a, float b);
	
	@Override
	default FloatToDoubleFunction aptFirst(float a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default FloatToDoubleFunction aptLast(float b)
	{
		return a -> apply(a, b);
	}
}