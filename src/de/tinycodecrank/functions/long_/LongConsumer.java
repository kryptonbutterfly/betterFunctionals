package de.tinycodecrank.functions.long_;

import de.tinycodecrank.functions.long_.applicable.LongApplicableLeft;
import de.tinycodecrank.functions.long_.applicable.LongApplicableRight;

@FunctionalInterface
public interface LongConsumer extends LongApplicableLeft<Runnable>, LongApplicableRight<Runnable>
{
	void apply(long a);
	
	@Override
	default Runnable aptFirst(long a)
	{
		return aptLast(a);
	}
	
	@Override
	default Runnable aptLast(long z)
	{
		return () -> apply(z);
	}
	
	/**
	 * @return a Function that accepts an argument and does nothing
	 */
	public static LongConsumer sink()
	{
		return SINK;
	}
	
	static final LongConsumer SINK = a ->
	{};
}