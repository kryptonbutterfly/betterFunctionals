package de.tinycodecrank.functions.short_;

import de.tinycodecrank.functions.float_.FloatSupplier;
import de.tinycodecrank.functions.short_.applicable.ShortApplicableLeft;
import de.tinycodecrank.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface ShortToFloatFunction extends ShortApplicableLeft<FloatSupplier>, ShortApplicableRight<FloatSupplier>
{
	float apply(short a);
	
	@Override
	default FloatSupplier aptFirst(short a)
	{
		return aptLast(a);
	}
	
	@Override
	default FloatSupplier aptLast(short z)
	{
		return () -> apply(z);
	}
}