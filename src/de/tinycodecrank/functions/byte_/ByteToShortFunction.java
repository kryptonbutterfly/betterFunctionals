package de.tinycodecrank.functions.byte_;

import de.tinycodecrank.functions.byte_.applicable.ByteApplicableLeft;
import de.tinycodecrank.functions.byte_.applicable.ByteApplicableRight;
import de.tinycodecrank.functions.short_.ShortSupplier;

@FunctionalInterface
public interface ByteToShortFunction extends ByteApplicableLeft<ShortSupplier>, ByteApplicableRight<ShortSupplier>
{
	short apply(byte a);
	
	@Override
	default ShortSupplier aptFirst(byte a)
	{
		return aptLast(a);
	}
	
	@Override
	default ShortSupplier aptLast(byte z)
	{
		return () -> apply(z);
	}
}