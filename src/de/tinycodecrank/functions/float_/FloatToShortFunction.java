package de.tinycodecrank.functions.float_;

import de.tinycodecrank.functions.float_.applicable.FloatApplicableLeft;
import de.tinycodecrank.functions.float_.applicable.FloatApplicableRight;
import de.tinycodecrank.functions.short_.ShortSupplier;

@FunctionalInterface
public interface FloatToShortFunction extends FloatApplicableLeft<ShortSupplier>, FloatApplicableRight<ShortSupplier>
{
	short apply(float a);
	
	@Override
	default ShortSupplier aptFirst(float a)
	{
		return aptLast(a);
	}
	
	@Override
	default ShortSupplier aptLast(float z)
	{
		return () -> apply(z);
	}
}