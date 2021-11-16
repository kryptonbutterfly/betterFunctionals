package de.tinycodecrank.functions.long_;

import java.util.function.LongToIntFunction;

import de.tinycodecrank.functions.long_.applicable.LongApplicableLeft;
import de.tinycodecrank.functions.long_.applicable.LongApplicableRight;

@FunctionalInterface
public interface BiLongToIntFunction extends LongApplicableLeft<LongToIntFunction>, LongApplicableRight<LongToIntFunction>
{
	int apply(long a, long b);
	
	@Override
	default LongToIntFunction aptFirst(long a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default LongToIntFunction aptLast(long b)
	{
		return a -> apply(a, b);
	}
}