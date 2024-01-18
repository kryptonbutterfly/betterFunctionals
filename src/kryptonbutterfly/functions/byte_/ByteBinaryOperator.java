package kryptonbutterfly.functions.byte_;

import kryptonbutterfly.functions.byte_.applicable.ByteApplicableLeft;
import kryptonbutterfly.functions.byte_.applicable.ByteApplicableRight;

@FunctionalInterface
public interface ByteBinaryOperator extends ByteApplicableLeft<ByteUnaryOperator>, ByteApplicableRight<ByteUnaryOperator>
{
	byte apply(byte a, byte b);
	
	@Override
	default ByteUnaryOperator aptFirst(byte a)
	{
		return z -> apply(a, z);
	}
	
	@Override
	default ByteUnaryOperator aptLast(byte z)
	{
		return a -> apply(a, z);
	}
}