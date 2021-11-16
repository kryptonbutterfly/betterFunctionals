package de.tinycodecrank.functions.long_;

import de.tinycodecrank.functions.long_.applicable.LongApplicableLeft;
import de.tinycodecrank.functions.long_.applicable.LongApplicableRight;

@FunctionalInterface
public interface BiLontToCharFunction extends LongApplicableLeft<LongToCharFunction>, LongApplicableRight<LongToCharFunction>
{
	char apply(long a, long b);
	
	@Override
	default LongToCharFunction aptFirst(long a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default LongToCharFunction aptLast(long b)
	{
		return a -> apply(a, b);
	}
}