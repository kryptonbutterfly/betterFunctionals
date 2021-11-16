package de.tinycodecrank.functions.double_;

import de.tinycodecrank.functions.double_.applicable.DoubleApplicableLeft;
import de.tinycodecrank.functions.double_.applicable.DoubleApplicableRight;
import de.tinycodecrank.functions.float_.FloatSupplier;

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