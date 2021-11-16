package de.tinycodecrank.functions.float_;

import de.tinycodecrank.functions.float_.applicable.FloatApplicableLeft;
import de.tinycodecrank.functions.float_.applicable.FloatApplicableRight;

@FunctionalInterface
public interface FloatConsumer extends FloatApplicableLeft<Runnable>, FloatApplicableRight<Runnable>
{
	void apply(float value);
	
	@Override
	default Runnable aptFirst(float a)
	{
		return aptLast(a);
	}
	
	@Override
	default Runnable aptLast(float z)
	{
		return () -> apply(z);
	}
}