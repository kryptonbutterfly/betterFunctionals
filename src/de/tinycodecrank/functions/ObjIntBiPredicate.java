package de.tinycodecrank.functions;

import java.util.function.IntPredicate;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.int_.applicable.IntApplicableRight;

public interface ObjIntBiPredicate<A> extends ApplicableLeft<A, IntPredicate>, IntApplicableRight<Predicate<A>>
{
	boolean test(A a, int b);
	
	@Override
	default IntPredicate aptFirst(A a)
	{
		return b -> test(a, b);
	}
	
	@Override
	default Predicate<A> aptLast(int b)
	{
		return a -> test(a, b);
	}
}