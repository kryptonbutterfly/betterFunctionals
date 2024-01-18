package kryptonbutterfly.functions.short_;

import kryptonbutterfly.functions.short_.applicable.ShortApplicableLeft;
import kryptonbutterfly.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface ShortUnaryOperator extends ShortApplicableLeft<ShortSupplier>, ShortApplicableRight<ShortSupplier>
{
	short apply(short a);
	
	@Override
	default ShortSupplier aptFirst(short a)
	{
		return aptLast(a);
	}
	
	@Override
	default ShortSupplier aptLast(short z)
	{
		return () -> apply(z);
	}
	
	/**
	 * @return a Function that returns the supplied value
	 */
	public static ShortUnaryOperator identity()
	{
		return IDENTITY;
	}
	
	static final ShortUnaryOperator IDENTITY = a -> a;
}