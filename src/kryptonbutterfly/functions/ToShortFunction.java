package kryptonbutterfly.functions;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.applicable.ApplicableRight;
import kryptonbutterfly.functions.short_.ShortSupplier;

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