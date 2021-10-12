package de.tinycodecrank.functions.int_;

import de.tinycodecrank.functions.int_.applicable.IntApplicableLeft;
import de.tinycodecrank.functions.int_.applicable.IntApplicableRight;

@FunctionalInterface
public interface IntTriConsumer extends IntApplicableRight<IntBiConsumer>, IntApplicableLeft<IntBiConsumer>
{
	void apply(int a, int b, int c);
	
	@Override
	default IntBiConsumer aptFirst(int a)
	{
		return (int b, int c) -> apply(a, b, c);
	}
	
	@Override
	default IntBiConsumer aptLast(int c)
	{
		return (int a, int b) -> apply(a, b, c);
	}
}