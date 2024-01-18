package kryptonbutterfly.functions;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface BiObjToByteFunction<A, B> extends ApplicableLeft<A, ToByteFunction<B>>, ApplicableRight<B, ToByteFunction<A>>
{
	byte apply(A a, B b);
	
	@Override
	default ToByteFunction<B> aptFirst(A a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default ToByteFunction<A> aptLast(B b)
	{
		return a -> apply(a, b);
	}
}