package de.tinycodecrank.functions.double_;

import de.tinycodecrank.functions.double_.applicable.DoubleApplicableLeft;
import de.tinycodecrank.functions.double_.applicable.DoubleApplicableRight;

@FunctionalInterface
public interface BiDoubleToByteFunction extends DoubleApplicableLeft<DoubleToByteFunction>, DoubleApplicableRight<DoubleToByteFunction>
{
	byte apply(double a, double b);
	
	@Override
	default DoubleToByteFunction aptFirst(double a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default DoubleToByteFunction aptLast(double b)
	{
		return a -> apply(a, b);
	}
}