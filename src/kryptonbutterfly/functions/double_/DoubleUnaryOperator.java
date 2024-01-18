package kryptonbutterfly.functions.double_;

import java.util.function.DoubleSupplier;

import kryptonbutterfly.functions.double_.applicable.DoubleApplicableLeft;
import kryptonbutterfly.functions.double_.applicable.DoubleApplicableRight;

@FunctionalInterface
public interface DoubleUnaryOperator extends DoubleApplicableLeft<DoubleSupplier>, DoubleApplicableRight<DoubleSupplier>
{
	double apply(double a);
	
	@Override
	default DoubleSupplier aptFirst(double a)
	{
		return aptLast(a);
	}
	
	@Override
	default DoubleSupplier aptLast(double z)
	{
		return () -> apply(z);
	}
	
	/**
	 * @return a Function that returns the supplied value
	 */
	public static DoubleUnaryOperator identity()
	{
		return IDENTITY;
	}
	
	static final DoubleUnaryOperator IDENTITY = a -> a;
}