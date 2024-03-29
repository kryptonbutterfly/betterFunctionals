package kryptonbutterfly.functions.short_;

import java.util.function.Supplier;

import kryptonbutterfly.functions.short_.applicable.ShortApplicableLeft;
import kryptonbutterfly.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface ShortFunction<R> extends ShortApplicableLeft<Supplier<R>>, ShortApplicableRight<Supplier<R>>
{
	R apply(short a);
	
	@Override
	default Supplier<R> aptFirst(short a)
	{
		return aptLast(a);
	}
	
	@Override
	default Supplier<R> aptLast(short z)
	{
		return () -> apply(z);
	}
}