package kryptonbutterfly.functions.float_;

import kryptonbutterfly.functions.float_.applicable.FloatApplicableLeft;
import kryptonbutterfly.functions.float_.applicable.FloatApplicableRight;

@FunctionalInterface
public interface FloatBinaryOperator extends FloatApplicableLeft<FloatUnaryOperator>, FloatApplicableRight<FloatUnaryOperator>
{
	float apply(float a, float b);
	
	@Override
	default FloatUnaryOperator aptFirst(float a)
	{
		return z -> apply(a, z);
	}
	
	@Override
	default FloatUnaryOperator aptLast(float z)
	{
		return a -> apply(a, z);
	}
}