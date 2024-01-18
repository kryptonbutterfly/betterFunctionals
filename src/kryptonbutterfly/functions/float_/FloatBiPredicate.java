package kryptonbutterfly.functions.float_;

import kryptonbutterfly.functions.float_.applicable.FloatApplicableLeft;
import kryptonbutterfly.functions.float_.applicable.FloatApplicableRight;

@FunctionalInterface
public interface FloatBiPredicate extends FloatApplicableLeft<FloatPredicate>, FloatApplicableRight<FloatPredicate>
{
	boolean test(float a, float b);
	
	@Override
	default FloatPredicate aptFirst(float a)
	{
		return b -> test(a, b);
	}
	
	@Override
	default FloatPredicate aptLast(float b)
	{
		return a -> test(a, b);
	}
}