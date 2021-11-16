package de.tinycodecrank.functions.double_;

import de.tinycodecrank.functions.double_.applicable.DoubleApplicableLeft;
import de.tinycodecrank.functions.double_.applicable.DoubleApplicableRight;

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