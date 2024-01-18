package kryptonbutterfly.functions;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface BiPredicate_<T, U> extends java.util.function.BiPredicate<T, U>, ApplicableRight<U, Predicate_<T>>, ApplicableLeft<T, Predicate_<U>>
{
	@Override
	default Predicate_<T> aptLast(U u)
	{
		return t -> test(t, u);
	}
	
	@Override
	default Predicate_<U> aptFirst(T t)
	{
		return u -> test(t, u);
	}
}