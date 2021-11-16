package de.tinycodecrank.functions.long_;

import java.util.function.LongPredicate;

import de.tinycodecrank.functions.long_.applicable.LongApplicableLeft;
import de.tinycodecrank.functions.long_.applicable.LongApplicableRight;

@FunctionalInterface
public interface LongBiPredicate extends LongApplicableLeft<LongPredicate>, LongApplicableRight<LongPredicate>
{
	boolean test(long a, long b);
	
	@Override
	default LongPredicate aptFirst(long a)
	{
		return b -> test(a, b);
	}
	
	@Override
	default LongPredicate aptLast(long b)
	{
		return a -> test(a, b);
	}
}