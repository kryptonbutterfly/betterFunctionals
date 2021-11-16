package de.tinycodecrank.functions.long_;

import de.tinycodecrank.functions.short_.ShortSupplier;

import de.tinycodecrank.functions.long_.applicable.LongApplicableLeft;
import de.tinycodecrank.functions.long_.applicable.LongApplicableRight;

@FunctionalInterface
public interface LongToShortFunction extends LongApplicableLeft<ShortSupplier>, LongApplicableRight<ShortSupplier>
{
	short apply(long a);
	
	@Override
	default ShortSupplier aptFirst(long a)
	{
		return aptLast(a);
	}
	
	@Override
	default ShortSupplier aptLast(long z)
	{
		return () -> apply(z);
	}
}