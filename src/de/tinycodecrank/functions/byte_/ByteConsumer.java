package de.tinycodecrank.functions.byte_;

import de.tinycodecrank.functions.byte_.applicable.ByteApplicableLeft;
import de.tinycodecrank.functions.byte_.applicable.ByteApplicableRight;

@FunctionalInterface
public interface ByteConsumer extends ByteApplicableLeft<Runnable>, ByteApplicableRight<Runnable>
{
	void apply(byte a);
	
	@Override
	default Runnable aptFirst(byte a)
	{
		return aptLast(a);
	}
	
	@Override
	default Runnable aptLast(byte z)
	{
		return () -> apply(z);
	}
}