package kryptonbutterfly.functions.float_;

import java.util.function.Supplier;

import kryptonbutterfly.functions.float_.applicable.FloatApplicableLeft;
import kryptonbutterfly.functions.float_.applicable.FloatApplicableRight;

@FunctionalInterface
public interface FloatFunction<R> extends FloatApplicableLeft<Supplier<R>>, FloatApplicableRight<Supplier<R>>
{
	R apply(float a);
	
	@Override
	default Supplier<R> aptFirst(float a)
	{
		return () -> apply(a);
	}
	
	@Override
	default Supplier<R> aptLast(float b)
	{
		return () -> apply(b);
	}
}