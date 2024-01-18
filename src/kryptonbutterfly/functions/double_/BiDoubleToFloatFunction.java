package kryptonbutterfly.functions.double_;

import kryptonbutterfly.functions.double_.applicable.DoubleApplicableLeft;
import kryptonbutterfly.functions.double_.applicable.DoubleApplicableRight;

@FunctionalInterface
public interface BiDoubleToFloatFunction extends DoubleApplicableLeft<DoubleToFloatFunction>, DoubleApplicableRight<DoubleToFloatFunction>
{
	float apply(double a, double b);
	
	@Override
	default DoubleToFloatFunction aptFirst(double a)
	{
		return b -> apply(a, b);
	}

	@Override
	default DoubleToFloatFunction aptLast(double b)
	{
		return a -> apply(a, b);
	}
}