package de.tinycodecrank.functions.float_;

import java.util.function.IntSupplier;

import de.tinycodecrank.functions.float_.applicable.FloatApplicableLeft;
import de.tinycodecrank.functions.float_.applicable.FloatApplicableRight;

@FunctionalInterface
public interface FloatToIntFunction extends FloatApplicableLeft<IntSupplier>, FloatApplicableRight<IntSupplier>
{
	int apply(float a);
	
	@Override
	default IntSupplier aptFirst(float a)
	{
		return aptLast(a);
	}
	
	@Override
	default IntSupplier aptLast(float z)
	{
		return () -> apply(z);
	}
}