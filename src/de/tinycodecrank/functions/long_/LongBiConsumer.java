package de.tinycodecrank.functions.long_;

import de.tinycodecrank.functions.long_.applicable.LongApplicableLeft;
import de.tinycodecrank.functions.long_.applicable.LongApplicableRight;

@FunctionalInterface
public interface LongBiConsumer extends LongApplicableLeft<LongConsumer>, LongApplicableRight<LongConsumer>
{
	void accept(long a, long b);
	
	@Override
	default LongConsumer aptFirst(long a)
	{
		return z -> accept(a, z);
	}
	
	@Override
	default LongConsumer aptLast(long z)
	{
		return a -> accept(a, z);
	}
}