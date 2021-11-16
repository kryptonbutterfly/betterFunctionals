package de.tinycodecrank.functions.int_;

import java.util.function.IntConsumer;

import de.tinycodecrank.functions.int_.applicable.IntApplicableLeft;
import de.tinycodecrank.functions.int_.applicable.IntApplicableRight;

@FunctionalInterface
public interface IntBiConsumer extends IntApplicableRight<IntConsumer>, IntApplicableLeft<IntConsumer>
{
	void apply(int a, int b);
	
	@Override
	default IntConsumer aptLast(int b)
	{
		return a -> apply(a, b);
	}
	
	@Override
	default IntConsumer aptFirst(int a)
	{
		return b -> apply(a, b);
	}
}