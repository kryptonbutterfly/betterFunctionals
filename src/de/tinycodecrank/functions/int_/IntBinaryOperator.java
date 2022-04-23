package de.tinycodecrank.functions.int_;

import de.tinycodecrank.functions.int_.applicable.IntApplicableLeft;
import de.tinycodecrank.functions.int_.applicable.IntApplicableRight;

@FunctionalInterface
public interface IntBinaryOperator extends IntApplicableLeft<IntUnaryOperator>, IntApplicableRight<IntUnaryOperator>
{
	int apply(int a, int b);
	
	@Override
	default IntUnaryOperator aptFirst(int a)
	{
		return z -> apply(a, z);
	}
	
	@Override
	default IntUnaryOperator aptLast(int z)
	{
		return a -> apply(a, z);
	}
}