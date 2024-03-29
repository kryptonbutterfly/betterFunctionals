package kryptonbutterfly.functions.float_;

import kryptonbutterfly.functions.float_.applicable.FloatApplicableLeft;
import kryptonbutterfly.functions.float_.applicable.FloatApplicableRight;

@FunctionalInterface
public interface BiFloatFunction<R> extends FloatApplicableLeft<FloatFunction<R>>, FloatApplicableRight<FloatFunction<R>>
{
	R apply(float a, float b);
	
	@Override
	default FloatFunction<R> aptFirst(float a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default FloatFunction<R> aptLast(float b)
	{
		return a -> apply(a, b);
	}
}