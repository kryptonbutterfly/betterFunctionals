package kryptonbutterfly.functions;

import java.util.function.ToDoubleFunction;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface BiObjToDoubleFunction<A, B> extends ApplicableLeft<A, ToDoubleFunction<B>>, ApplicableRight<B, ToDoubleFunction<A>>
{
	double apply(A a, B b);
	
	@Override
	default ToDoubleFunction<B> aptFirst(A a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default ToDoubleFunction<A> aptLast(B b)
	{
		return a -> apply(a, b);
	}
}