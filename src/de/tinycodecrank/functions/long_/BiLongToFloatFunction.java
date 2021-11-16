package de.tinycodecrank.functions.long_;

import de.tinycodecrank.functions.long_.applicable.LongApplicableLeft;
import de.tinycodecrank.functions.long_.applicable.LongApplicableRight;

@FunctionalInterface
public interface BiLongToFloatFunction extends LongApplicableLeft<LongToFloatFunction>, LongApplicableRight<LongToFloatFunction>
{
	float apply(long a, long b);
	
	@Override
	default LongToFloatFunction aptFirst(long a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default LongToFloatFunction aptLast(long b)
	{
		return a -> apply(a, b);
	}
}