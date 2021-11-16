package de.tinycodecrank.functions;

import java.util.function.ToLongFunction;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface BiObjToLongFunction<A, B> extends ApplicableLeft<A, ToLongFunction<B>>, ApplicableRight<B, ToLongFunction<A>>
{
	long apply(A a, B b);
	
	@Override
	default ToLongFunction<B> aptFirst(A a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default ToLongFunction<A> aptLast(B b)
	{
		return a -> apply(a, b);
	}
}