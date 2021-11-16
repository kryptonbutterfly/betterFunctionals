package de.tinycodecrank.functions.short_;

import de.tinycodecrank.functions.short_.applicable.ShortApplicableLeft;
import de.tinycodecrank.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface ShortBiConsumer extends ShortApplicableLeft<ShortConsumer>, ShortApplicableRight<ShortConsumer>
{
	void accept(short a, short b);
	
	@Override
	default ShortConsumer aptFirst(short a)
	{
		return z -> accept(a, z);
	}
	
	@Override
	default ShortConsumer aptLast(short z)
	{
		return a -> accept(a, z);
	}
}