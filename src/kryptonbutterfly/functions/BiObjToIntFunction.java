package kryptonbutterfly.functions;

import java.util.function.ToIntFunction;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface BiObjToIntFunction<A, B> extends ApplicableLeft<A, ToIntFunction<B>>, ApplicableRight<B, ToIntFunction<A>>
{
	int apply(A a, B b);
	
	@Override
	default ToIntFunction<B> aptFirst(A a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default ToIntFunction<A> aptLast(B b)
	{
		return a -> apply(a, b);
	}
}