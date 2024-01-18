package kryptonbutterfly.functions.byte_;

import kryptonbutterfly.functions.byte_.applicable.ByteApplicableLeft;
import kryptonbutterfly.functions.byte_.applicable.ByteApplicableRight;

@FunctionalInterface
public interface ByteUnaryOperator extends ByteApplicableLeft<ByteSupplier>, ByteApplicableRight<ByteSupplier>
{
	byte apply(byte a);
	
	@Override
	default ByteSupplier aptFirst(byte a)
	{
		return aptLast(a);
	}
	
	@Override
	default ByteSupplier aptLast(byte z)
	{
		return () -> apply(z);
	}
	
	/**
	 * @return a Function that returns the supplied value
	 */
	public static ByteUnaryOperator identity()
	{
		return IDENTITY;
	}
	
	static final ByteUnaryOperator IDENTITY = a -> a;
}