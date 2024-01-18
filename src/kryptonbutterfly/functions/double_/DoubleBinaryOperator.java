package kryptonbutterfly.functions.double_;

import kryptonbutterfly.functions.double_.applicable.DoubleApplicableLeft;
import kryptonbutterfly.functions.double_.applicable.DoubleApplicableRight;

@FunctionalInterface
public interface DoubleBinaryOperator extends DoubleApplicableLeft<DoubleUnaryOperator>, DoubleApplicableRight<DoubleUnaryOperator>
{
	double apply(double a, double b);
	
	@Override
	default DoubleUnaryOperator aptFirst(double a)
	{
		return z -> apply(a, z);
	}
	
	@Override
	default DoubleUnaryOperator aptLast(double z)
	{
		return a -> apply(a, z);
	}
}