package de.tinycodecrank.functions.double_;

import java.util.function.DoubleSupplier;

import de.tinycodecrank.functions.double_.applicable.DoubleApplicableLeft;
import de.tinycodecrank.functions.double_.applicable.DoubleApplicableRight;

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
}