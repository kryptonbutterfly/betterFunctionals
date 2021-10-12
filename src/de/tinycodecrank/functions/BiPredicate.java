package de.tinycodecrank.functions;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;

public interface BiPredicate<T, U> extends java.util.function.BiPredicate<T, U>, ApplicableRight<U, Predicate<T>>, ApplicableLeft<T, Predicate<U>>
{
	@Override
	default Predicate<T> aptLast(U u)
	{
		return t -> test(t, u);
	}
	
	@Override
	default Predicate<U> aptFirst(T t)
	{
		return u -> test(t, u);
	}
}