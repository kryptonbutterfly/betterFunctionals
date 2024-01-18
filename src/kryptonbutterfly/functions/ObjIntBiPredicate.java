package kryptonbutterfly.functions;

import java.util.function.IntPredicate;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.int_.applicable.IntApplicableRight;

@FunctionalInterface
public interface ObjIntBiPredicate<A> extends ApplicableLeft<A, IntPredicate>, IntApplicableRight<Predicate_<A>>
{
	boolean test(A a, int b);
	
	@Override
	default IntPredicate aptFirst(A a)
	{
		return b -> test(a, b);
	}
	
	@Override
	default Predicate_<A> aptLast(int b)
	{
		return a -> test(a, b);
	}
}