package de.tinycodecrank.functions.int_;

import de.tinycodecrank.functions.int_.applicable.IntApplicableLeft;
import de.tinycodecrank.functions.int_.applicable.IntApplicableRight;

public interface IntQuadConsumer extends IntApplicableRight<IntTriConsumer>, IntApplicableLeft<IntTriConsumer>
{
	void apply(int a, int b, int c, int d);
	
	@Override
	default IntTriConsumer aptFirst(int a)
	{
		return (int b, int c, int d) -> apply(a, b, c, d);
	}
	
	@Override
	default IntTriConsumer aptLast(int d)
	{
		return (int a, int b, int c) -> apply(a, b, c, d);
	}
}