package de.tinycodecrank.functions.char_;

import de.tinycodecrank.functions.char_.applicable.CharApplicableRight;
import de.tinycodecrank.functions.float_.FloatSupplier;
import de.tinycodecrank.functions.char_.applicable.CharApplicableLeft;

@FunctionalInterface
public interface CharToFloatFunction extends CharApplicableLeft<FloatSupplier>, CharApplicableRight<FloatSupplier>
{
	float apply(char a);
	
	@Override
	default FloatSupplier aptFirst(char a)
	{
		return aptLast(a);
	}
	
	@Override
	default FloatSupplier aptLast(char z)
	{
		return () -> apply(z);
	}
}