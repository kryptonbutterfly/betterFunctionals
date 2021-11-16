package de.tinycodecrank.functions.long_;

import java.util.function.LongFunction;

import de.tinycodecrank.functions.long_.applicable.LongApplicableLeft;
import de.tinycodecrank.functions.long_.applicable.LongApplicableRight;

@FunctionalInterface
public interface BiLongFunction<R> extends LongApplicableLeft<LongFunction<R>>, LongApplicableRight<LongFunction<R>>
{
	R apply(long a, long b);
	
	@Override
	default LongFunction<R> aptFirst(long a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default LongFunction<R> aptLast(long b)
	{
		return a -> apply(a, b);
	}
}