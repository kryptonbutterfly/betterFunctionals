package de.tinycodecrank.functions.bool_;

import de.tinycodecrank.functions.bool_.applicable.BoolApplicableLeft;
import de.tinycodecrank.functions.bool_.applicable.BoolApplicableRight;
import de.tinycodecrank.functions.char_.CharSupplier;

@FunctionalInterface
public interface BoolToCharFunction extends BoolApplicableLeft<CharSupplier>, BoolApplicableRight<CharSupplier>
{
	char apply(boolean a);
	
	@Override
	default CharSupplier aptFirst(boolean a)
	{
		return aptLast(a);
	}
	
	@Override
	default CharSupplier aptLast(boolean z)
	{
		return () -> apply(z);
	}
}