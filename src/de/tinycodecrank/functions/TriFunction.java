package de.tinycodecrank.functions;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface TriFunction<A, B, C, R> extends ApplicableLeft<A, BiFunction_<B, C, R>>, ApplicableRight<C, BiFunction_<A, B, R>>
{
	R apply(A a, B b, C c);
	
	@Override
	default BiFunction_<B, C, R> aptFirst(A a)
	{
		return (b, c) -> apply(a, b, c);
	}
	
	@Override
	default BiFunction_<A, B, R> aptLast(C c)
	{
		return (a, b) -> apply(a, b, c);
	}
}