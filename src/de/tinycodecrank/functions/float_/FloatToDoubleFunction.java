package de.tinycodecrank.functions.float_;

import java.util.function.DoubleSupplier;

import de.tinycodecrank.functions.float_.applicable.FloatApplicableLeft;
import de.tinycodecrank.functions.float_.applicable.FloatApplicableRight;

@FunctionalInterface
public interface FloatToDoubleFunction extends FloatApplicableLeft<DoubleSupplier>, FloatApplicableRight<DoubleSupplier>
{
	double apply(float a);
	
	@Override
	default DoubleSupplier aptFirst(float a)
	{
		return aptLast(a);
	}
	
	@Override
	default DoubleSupplier aptLast(float z)
	{
		return () -> apply(z);
	}
}