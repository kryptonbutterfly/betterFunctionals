package de.tinycodecrank.functions.double_;

import java.util.function.DoubleToIntFunction;

import de.tinycodecrank.functions.double_.applicable.DoubleApplicableLeft;
import de.tinycodecrank.functions.double_.applicable.DoubleApplicableRight;

@FunctionalInterface
public interface BiDoubleToIntFunction extends DoubleApplicableLeft<DoubleToIntFunction>, DoubleApplicableRight<DoubleToIntFunction>
{
	int apply(double a, double b);
	
	@Override
	default DoubleToIntFunction aptFirst(double a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default DoubleToIntFunction aptLast(double b)
	{
		return a -> apply(a, b);
	}
}