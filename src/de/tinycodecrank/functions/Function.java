package de.tinycodecrank.functions;

import java.util.function.Supplier;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;

public interface Function<T, R> extends java.util.function.Function<T, R>, ApplicableRight<T, Supplier<R>>, ApplicableLeft<T, Supplier<R>>
{
	@Override
	default Supplier<R> aptFirst(T t)
	{
		return () -> apply(t);
	}
	
	@Override
	default Supplier<R> aptLast(T t)
	{
		return () -> apply(t);
	}
}