package de.tinycodecrank.functions.int_;

import de.tinycodecrank.functions.int_.applicable.IntApplicableLeft;
import de.tinycodecrank.functions.short_.ShortSupplier;
import de.tinycodecrank.functions.int_.applicable.IntApplicableRight;

@FunctionalInterface
public interface IntToShortFunction extends IntApplicableLeft<ShortSupplier>, IntApplicableRight<ShortSupplier>
{
	short apply(int a);
	
	@Override
	default ShortSupplier aptFirst(int a)
	{
		return aptLast(a);
	}
	
	@Override
	default ShortSupplier aptLast(int z)
	{
		return () -> apply(z);
	}
}