package kryptonbutterfly.functions.char_;

import kryptonbutterfly.functions.char_.applicable.CharApplicableLeft;
import kryptonbutterfly.functions.char_.applicable.CharApplicableRight;

@FunctionalInterface
public interface CharUnaryOperator extends CharApplicableLeft<CharSupplier>, CharApplicableRight<CharSupplier>
{
	char apply(char a);
	
	@Override
	default CharSupplier aptFirst(char a)
	{
		return aptLast(a);
	}
	
	@Override
	default CharSupplier aptLast(char z)
	{
		return () -> apply(z);
	}
	
	/**
	 * @return a Function that returns the supplied value
	 */
	public static CharUnaryOperator identity()
	{
		return IDENTITY;
	}
	
	static final CharUnaryOperator IDENTITY = a -> a;
}