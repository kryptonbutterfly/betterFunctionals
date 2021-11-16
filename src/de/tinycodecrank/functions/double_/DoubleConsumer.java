package de.tinycodecrank.functions.double_;

import de.tinycodecrank.functions.double_.applicable.DoubleApplicableLeft;
import de.tinycodecrank.functions.double_.applicable.DoubleApplicableRight;

@FunctionalInterface
public interface DoubleConsumer extends DoubleApplicableLeft<Runnable>, DoubleApplicableRight<Runnable>
{
	void apply(double a);
	
	@Override
	default Runnable aptFirst(double a)
	{
		return aptLast(a);
	}
	
	@Override
	default Runnable aptLast(double z)
	{
		return () -> apply(z);
	}
}