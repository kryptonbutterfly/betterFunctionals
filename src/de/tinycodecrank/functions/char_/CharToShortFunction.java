package de.tinycodecrank.functions.char_;

import de.tinycodecrank.functions.char_.applicable.CharApplicableLeft;
import de.tinycodecrank.functions.short_.ShortSupplier;
import de.tinycodecrank.functions.char_.applicable.CharApplicableRight;

@FunctionalInterface
public interface CharToShortFunction extends CharApplicableLeft<ShortSupplier>, CharApplicableRight<ShortSupplier>
{
	short apply(char a);
	
	@Override
	default ShortSupplier aptFirst(char a)
	{
		return aptLast(a);
	}
	
	@Override
	default ShortSupplier aptLast(char z)
	{
		return () -> apply(z);
	}
}