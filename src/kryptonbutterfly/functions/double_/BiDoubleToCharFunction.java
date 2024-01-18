package kryptonbutterfly.functions.double_;

import kryptonbutterfly.functions.double_.applicable.DoubleApplicableLeft;
import kryptonbutterfly.functions.double_.applicable.DoubleApplicableRight;

@FunctionalInterface
public interface BiDoubleToCharFunction extends DoubleApplicableLeft<DoubleToCharFunction>, DoubleApplicableRight<DoubleToCharFunction>
{
	char apply(double a, double b);
	
	@Override
	default DoubleToCharFunction aptFirst(double a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default DoubleToCharFunction aptLast(double b)
	{
		return a -> apply(a, b);
	}
}