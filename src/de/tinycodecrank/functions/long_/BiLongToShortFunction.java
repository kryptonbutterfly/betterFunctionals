package de.tinycodecrank.functions.long_;

import de.tinycodecrank.functions.long_.applicable.LongApplicableLeft;
import de.tinycodecrank.functions.long_.applicable.LongApplicableRight;

@FunctionalInterface
public interface BiLongToShortFunction extends LongApplicableLeft<LongToShortFunction>, LongApplicableRight<LongToShortFunction>
{
	short apply(long a, long b);
	
	@Override
	default LongToShortFunction aptFirst(long a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default LongToShortFunction aptLast(long b)
	{
		return a -> apply(a, b);
	}
}