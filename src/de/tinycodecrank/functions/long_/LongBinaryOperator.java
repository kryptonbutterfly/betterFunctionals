package de.tinycodecrank.functions.long_;

import de.tinycodecrank.functions.long_.applicable.LongApplicableLeft;
import de.tinycodecrank.functions.long_.applicable.LongApplicableRight;

@FunctionalInterface
public interface LongBinaryOperator extends LongApplicableLeft<LongUnaryOperator>, LongApplicableRight<LongUnaryOperator>
{
	long apply(long a, long z);
	
	@Override
	default LongUnaryOperator aptFirst(long a)
	{
		return z -> apply(a, z);
	}
	
	@Override
	default LongUnaryOperator aptLast(long z)
	{
		return a -> apply(a, z);
	}
}