package de.tinycodecrank.functions.long_;

import java.util.function.LongSupplier;

import de.tinycodecrank.functions.long_.applicable.LongApplicableLeft;
import de.tinycodecrank.functions.long_.applicable.LongApplicableRight;

@FunctionalInterface
public interface LongUnaryOperator extends LongApplicableLeft<LongSupplier>, LongApplicableRight<LongSupplier>
{
	long apply(long a);
	
	@Override
	default LongSupplier aptFirst(long a)
	{
		return aptLast(a);
	}
	
	@Override
	default LongSupplier aptLast(long z)
	{
		return () -> apply(z);
	}
	
	/**
	 * @return a Function that returns the supplied value
	 */
	public static LongUnaryOperator identity()
	{
		return IDENTITY;
	}
	
	static final LongUnaryOperator IDENTITY = a -> a;
}