package kryptonbutterfly.functions.int_;

import java.util.function.IntFunction;

import kryptonbutterfly.functions.int_.applicable.IntApplicableLeft;
import kryptonbutterfly.functions.int_.applicable.IntApplicableRight;

@FunctionalInterface
public interface BiIntFunction<R> extends IntApplicableLeft<IntFunction<R>>, IntApplicableRight<IntFunction<R>>
{
	R apply(int a, int b);
	
	@Override
	default IntFunction<R> aptFirst(int a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default IntFunction<R> aptLast(int b)
	{
		return a -> apply(a, b);
	}
}