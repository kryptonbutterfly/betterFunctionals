package de.tinycodecrank.functions;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface BiObjToFloatFunction<A, B> extends ApplicableLeft<A, ToFloatFunction<B>>, ApplicableRight<B, ToFloatFunction<A>>
{
	float apply(A a, B b);
	
	@Override
	default ToFloatFunction<B> aptFirst(A a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default ToFloatFunction<A> aptLast(B b)
	{
		return a -> apply(a, b);
	}
}