package de.tinycodecrank.functions.float_;

import de.tinycodecrank.functions.char_.CharSupplier;
import de.tinycodecrank.functions.float_.applicable.FloatApplicableLeft;
import de.tinycodecrank.functions.float_.applicable.FloatApplicableRight;

@FunctionalInterface
public interface FloatToCharFunction extends FloatApplicableLeft<CharSupplier>, FloatApplicableRight<CharSupplier>
{
	char apply(float a);
	
	@Override
	default CharSupplier aptFirst(float a)
	{
		return aptLast(a);
	}
	
	@Override
	default CharSupplier aptLast(float z)
	{
		return () -> apply(z);
	}
}