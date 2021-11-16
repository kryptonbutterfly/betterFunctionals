package de.tinycodecrank.functions.float_;

import java.util.function.LongSupplier;

import de.tinycodecrank.functions.float_.applicable.FloatApplicableLeft;
import de.tinycodecrank.functions.float_.applicable.FloatApplicableRight;

@FunctionalInterface
public interface FloatToLongFunction extends FloatApplicableLeft<LongSupplier>, FloatApplicableRight<LongSupplier>
{
	long apply(float a);
	
	@Override
	default LongSupplier aptFirst(float a)
	{
		return aptLast(a);
	}
	
	@Override
	default LongSupplier aptLast(float z)
	{
		return () -> apply(z);
	}
}