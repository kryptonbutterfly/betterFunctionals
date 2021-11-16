package de.tinycodecrank.functions.long_;

import de.tinycodecrank.functions.long_.applicable.LongApplicableRight;
import de.tinycodecrank.functions.float_.FloatSupplier;
import de.tinycodecrank.functions.long_.applicable.LongApplicableLeft;

@FunctionalInterface
public interface LongToFloatFunction extends LongApplicableLeft<FloatSupplier>, LongApplicableRight<FloatSupplier>
{
	float apply(long a);
	
	@Override
	default FloatSupplier aptFirst(long a)
	{
		return aptLast(a);
	}
	
	@Override
	default FloatSupplier aptLast(long z)
	{
		return () -> apply(z);
	}
}