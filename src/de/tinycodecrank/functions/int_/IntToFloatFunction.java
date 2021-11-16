package de.tinycodecrank.functions.int_;

import de.tinycodecrank.functions.float_.FloatSupplier;
import de.tinycodecrank.functions.int_.applicable.IntApplicableLeft;
import de.tinycodecrank.functions.int_.applicable.IntApplicableRight;

@FunctionalInterface
public interface IntToFloatFunction extends IntApplicableLeft<FloatSupplier>, IntApplicableRight<FloatSupplier>
{
	float apply(int a);
	
	@Override
	default FloatSupplier aptFirst(int a)
	{
		return aptLast(a);
	}
	
	@Override
	default FloatSupplier aptLast(int z)
	{
		return () -> apply(z);
	}
}