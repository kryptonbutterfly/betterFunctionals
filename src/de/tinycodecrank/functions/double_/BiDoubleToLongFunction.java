package de.tinycodecrank.functions.double_;

import java.util.function.DoubleToLongFunction;

import de.tinycodecrank.functions.double_.applicable.DoubleApplicableLeft;
import de.tinycodecrank.functions.double_.applicable.DoubleApplicableRight;

@FunctionalInterface
public interface BiDoubleToLongFunction extends DoubleApplicableLeft<DoubleToLongFunction>, DoubleApplicableRight<DoubleToLongFunction>
{
	long apply(double a, double b);
	
	@Override
	default DoubleToLongFunction aptFirst(double a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default DoubleToLongFunction aptLast(double b)
	{
		return a -> apply(a, b);
	}
}