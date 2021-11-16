package de.tinycodecrank.functions.double_;

import java.util.function.DoublePredicate;

import de.tinycodecrank.functions.double_.applicable.DoubleApplicableLeft;
import de.tinycodecrank.functions.double_.applicable.DoubleApplicableRight;

@FunctionalInterface
public interface DoubleBiPredicate extends DoubleApplicableLeft<DoublePredicate>, DoubleApplicableRight<DoublePredicate>
{
	boolean test(double a, double b);
	
	@Override
	default DoublePredicate aptFirst(double a)
	{
		return b -> test(a, b);
	}
	
	@Override
	default DoublePredicate aptLast(double b)
	{
		return a -> test(a, b);
	}
}