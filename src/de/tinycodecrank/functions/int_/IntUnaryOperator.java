package de.tinycodecrank.functions.int_;

import java.util.function.IntSupplier;

import de.tinycodecrank.functions.int_.applicable.IntApplicableLeft;
import de.tinycodecrank.functions.int_.applicable.IntApplicableRight;

@FunctionalInterface
public interface IntUnaryOperator extends IntApplicableLeft<IntSupplier>, IntApplicableRight<IntSupplier>
{
	int apply(int a);
	
	@Override
	default IntSupplier aptFirst(int a)
	{
		return aptLast(a);
	}
	
	@Override
	default IntSupplier aptLast(int z)
	{
		return () -> apply(z);
	}
	
	/**
	 * @return a Function that returns the supplied value
	 */
	public static IntUnaryOperator identity()
	{
		return IDENTITY;
	}
	
	static final IntUnaryOperator IDENTITY = a -> a;
}