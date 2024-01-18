package kryptonbutterfly.functions.byte_;

import kryptonbutterfly.functions.byte_.applicable.ByteApplicableLeft;
import kryptonbutterfly.functions.byte_.applicable.ByteApplicableRight;

@FunctionalInterface
public interface BiByteFunction<R> extends ByteApplicableLeft<ByteFunction<R>>, ByteApplicableRight<ByteFunction<R>>
{
	R apply(byte a, byte b);
	
	@Override
	default ByteFunction<R> aptFirst(byte a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default ByteFunction<R> aptLast(byte b)
	{
		return a -> apply(a, b);
	}
}