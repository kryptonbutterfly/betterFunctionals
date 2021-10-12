package de.tinycodecrank.functions.bool_;

import de.tinycodecrank.functions.bool_.applicable.BoolApplicableLeft;
import de.tinycodecrank.functions.bool_.applicable.BoolApplicableRight;

@FunctionalInterface
public interface BoolConsumer extends BoolApplicableRight<Runnable>, BoolApplicableLeft<Runnable>
{
	void accept(boolean bool);
	
	@Override
	default Runnable aptFirst(boolean bool)
	{
		return aptLast(bool);
	}
	
	@Override
	default Runnable aptLast(boolean bool)
	{
		return () -> accept(bool);
	}
}