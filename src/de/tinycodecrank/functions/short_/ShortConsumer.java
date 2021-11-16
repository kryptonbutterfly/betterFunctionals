package de.tinycodecrank.functions.short_;

import de.tinycodecrank.functions.short_.applicable.ShortApplicableLeft;
import de.tinycodecrank.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface ShortConsumer extends ShortApplicableRight<Runnable>, ShortApplicableLeft<Runnable>
{
	void accept(short a);
	
	@Override
	default Runnable aptFirst(short a)
	{
		return aptLast(a);
	}
	
	@Override
	default Runnable aptLast(short z)
	{
		return () -> accept(z);
	}
}