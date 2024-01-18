package kryptonbutterfly.functions.float_;

import kryptonbutterfly.functions.float_.applicable.FloatApplicableLeft;
import kryptonbutterfly.functions.float_.applicable.FloatApplicableRight;

@FunctionalInterface
public interface BiFloatToCharFunction extends FloatApplicableLeft<FloatToCharFunction>, FloatApplicableRight<FloatToCharFunction>
{
	char apply(float a, float b);
	
	@Override
	default FloatToCharFunction aptFirst(float a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default FloatToCharFunction aptLast(float b)
	{
		return a -> apply(a, b);
	}
}