package kryptonbutterfly.functions;

import java.util.function.Function;
import java.util.function.IntFunction;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.int_.applicable.IntApplicableRight;

@FunctionalInterface
public interface ObjIntBiFunction<A, R> extends ApplicableLeft<A, IntFunction<R>>, IntApplicableRight<Function<A, R>>
{
	R apply(A a, int b);
	
	@Override
	default IntFunction<R> aptFirst(A a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default Function<A, R> aptLast(int b)
	{
		return a -> apply(a, b);
	}
}