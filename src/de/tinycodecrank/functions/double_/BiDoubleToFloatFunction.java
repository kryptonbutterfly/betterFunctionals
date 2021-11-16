package de.tinycodecrank.functions.double_;

import de.tinycodecrank.functions.double_.applicable.DoubleApplicableLeft;
import de.tinycodecrank.functions.double_.applicable.DoubleApplicableRight;

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