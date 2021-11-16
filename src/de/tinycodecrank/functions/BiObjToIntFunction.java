package de.tinycodecrank.functions;

import java.util.function.ToIntFunction;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;

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