package kryptonbutterfly.functions;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface BiObjToShortFunction<A, B> extends ApplicableLeft<A, ToShortFunction<B>>, ApplicableRight<B, ToShortFunction<A>>
{
	short apply(A a, B b);
	
	@Override
	default ToShortFunction<B> aptFirst(A a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default ToShortFunction<A> aptLast(B b)
	{
		return a -> apply(a, b);
	}
}