package de.tinycodecrank.functions.short_;

import de.tinycodecrank.functions.char_.CharSupplier;
import de.tinycodecrank.functions.short_.applicable.ShortApplicableLeft;
import de.tinycodecrank.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface ShortToCharFunction extends ShortApplicableLeft<CharSupplier>, ShortApplicableRight<CharSupplier>
{
	char apply(short a);
	
	@Override
	default CharSupplier aptFirst(short a)
	{
		return aptLast(a);
	}
	
	@Override
	default CharSupplier aptLast(short z)
	{
		return () -> apply(z);
	}
}