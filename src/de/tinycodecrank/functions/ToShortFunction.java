package de.tinycodecrank.functions;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;
import de.tinycodecrank.functions.short_.ShortSupplier;

@FunctionalInterface
public interface ToShortFunction<T> extends ApplicableLeft<T, ShortSupplier>, ApplicableRight<T, ShortSupplier>
{
	short apply(T a);
	
	@Override
	default ShortSupplier aptFirst(T t)
	{
		return aptLast(t);
	}
	
	@Override
	default ShortSupplier aptLast(T t)
	{
		return () -> apply(t);
	}
}