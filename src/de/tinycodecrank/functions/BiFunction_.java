package de.tinycodecrank.functions;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface BiFunction_<T, U, R> extends java.util.function.BiFunction<T, U, R>, ApplicableLeft<T, Function_<U, R>>, ApplicableRight<U, Function_<T, R>>
{
	@Override
	default Function_<U, R> aptFirst(T t)
	{
		return (U u) -> apply(t, u);
	}
	
	@Override
	default Function_<T, R> aptLast(U u)
	{
		return (T t) -> apply(t, u);
	}
}