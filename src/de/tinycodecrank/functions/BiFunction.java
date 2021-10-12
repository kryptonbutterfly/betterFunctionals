package de.tinycodecrank.functions;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface BiFunction<T, U, R> extends java.util.function.BiFunction<T, U, R>, ApplicableLeft<T, Function<U, R>>, ApplicableRight<U, Function<T, R>>
{
	@Override
	default Function<U, R> aptFirst(T t)
	{
		return (U u) -> apply(t, u);
	}
	
	@Override
	default Function<T, R> aptLast(U u)
	{
		return (T t) -> apply(t, u);
	}
}