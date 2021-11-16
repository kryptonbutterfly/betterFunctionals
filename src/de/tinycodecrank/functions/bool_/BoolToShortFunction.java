package de.tinycodecrank.functions.bool_;

import de.tinycodecrank.functions.bool_.applicable.BoolApplicableLeft;
import de.tinycodecrank.functions.bool_.applicable.BoolApplicableRight;
import de.tinycodecrank.functions.short_.ShortSupplier;

@FunctionalInterface
public interface BoolToShortFunction extends BoolApplicableLeft<ShortSupplier>, BoolApplicableRight<ShortSupplier>
{
	short apply(boolean a);
	
	@Override
	default ShortSupplier aptFirst(boolean a)
	{
		return aptLast(a);
	}
	
	@Override
	default ShortSupplier aptLast(boolean z)
	{
		return () -> apply(z);
	}
}