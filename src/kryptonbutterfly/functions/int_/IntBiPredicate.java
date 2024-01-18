package kryptonbutterfly.functions.int_;

import java.util.function.IntPredicate;

import kryptonbutterfly.functions.int_.applicable.IntApplicableLeft;
import kryptonbutterfly.functions.int_.applicable.IntApplicableRight;

@FunctionalInterface
public interface IntBiPredicate extends IntApplicableLeft<IntPredicate>, IntApplicableRight<IntPredicate>
{
	boolean test(int a, int b);
	
	@Override
	default IntPredicate aptFirst(int a)
	{
		return b -> test(a, b);
	}
	
	@Override
	default IntPredicate aptLast(int b)
	{
		return a -> test(a, b);
	}
}