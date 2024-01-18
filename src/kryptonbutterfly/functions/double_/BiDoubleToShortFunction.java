package kryptonbutterfly.functions.double_;

import kryptonbutterfly.functions.double_.applicable.DoubleApplicableLeft;
import kryptonbutterfly.functions.double_.applicable.DoubleApplicableRight;

@FunctionalInterface
public interface BiDoubleToShortFunction extends DoubleApplicableLeft<DoubleToShortFunction>, DoubleApplicableRight<DoubleToShortFunction>
{
	short apply(double a, double b);
	
	@Override
	default DoubleToShortFunction aptFirst(double a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default DoubleToShortFunction aptLast(double z)
	{
		return a -> apply(a, z);
	}
}