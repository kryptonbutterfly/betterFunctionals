package de.tinycodecrank.functions.long_;

import de.tinycodecrank.functions.byte_.ByteSupplier;
import de.tinycodecrank.functions.long_.applicable.LongApplicableLeft;
import de.tinycodecrank.functions.long_.applicable.LongApplicableRight;

@FunctionalInterface
public interface LongToByteFunction extends LongApplicableLeft<ByteSupplier>, LongApplicableRight<ByteSupplier>
{
	byte apply(long a);
	
	@Override
	default ByteSupplier aptFirst(long a)
	{
		return aptLast(a);
	}
	
	@Override
	default ByteSupplier aptLast(long z)
	{
		return () -> apply(z);
	}
}