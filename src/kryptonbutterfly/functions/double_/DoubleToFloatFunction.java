package kryptonbutterfly.functions.double_;

import kryptonbutterfly.functions.double_.applicable.DoubleApplicableLeft;
import kryptonbutterfly.functions.double_.applicable.DoubleApplicableRight;
import kryptonbutterfly.functions.float_.FloatSupplier;

@FunctionalInterface
public interface DoubleToFloatFunction extends DoubleApplicableLeft<FloatSupplier>, DoubleApplicableRight<FloatSupplier>
{
	float apply(double a);
	
	@Override
	default FloatSupplier aptFirst(double a)
	{
		return aptLast(a);
	}
	
	@Override
	default FloatSupplier aptLast(double z)
	{
		return () -> apply(z);
	}
}