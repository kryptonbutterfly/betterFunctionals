package kryptonbutterfly.functions;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface BiObjToCharFunction<A, B> extends ApplicableLeft<A, ToCharFunction<B>>, ApplicableRight<B, ToCharFunction<A>>
{
	char apply(A a, B b);
	
	@Override
	default ToCharFunction<B> aptFirst(A a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default ToCharFunction<A> aptLast(B b)
	{
		return a -> apply(a, b);
	}
}