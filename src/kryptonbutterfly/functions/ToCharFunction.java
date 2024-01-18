package kryptonbutterfly.functions;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.applicable.ApplicableRight;
import kryptonbutterfly.functions.char_.CharSupplier;

@FunctionalInterface
public interface ToCharFunction<T> extends ApplicableLeft<T, CharSupplier>, ApplicableRight<T, CharSupplier>
{
	char apply(T a);
	
	@Override
	default CharSupplier aptFirst(T t)
	{
		return aptLast(t);
	}
	
	@Override
	default CharSupplier aptLast(T t)
	{
		return () -> apply(t);
	}
}