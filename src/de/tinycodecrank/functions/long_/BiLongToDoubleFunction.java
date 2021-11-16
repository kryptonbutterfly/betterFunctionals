package de.tinycodecrank.functions.long_;

import java.util.function.LongToDoubleFunction;

import de.tinycodecrank.functions.long_.applicable.LongApplicableLeft;
import de.tinycodecrank.functions.long_.applicable.LongApplicableRight;

@FunctionalInterface
public interface BiLongToDoubleFunction extends LongApplicableLeft<LongToDoubleFunction>, LongApplicableRight<LongToDoubleFunction>
{
	double apply(long a, long b);
	
	@Override
	default LongToDoubleFunction aptFirst(long a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default LongToDoubleFunction aptLast(long b)
	{
		return a -> apply(a, b);
	}
}