package de.tinycodecrank.functions.bool_;

import de.tinycodecrank.functions.bool_.applicable.BoolApplicableLeft;
import de.tinycodecrank.functions.bool_.applicable.BoolApplicableRight;
import de.tinycodecrank.functions.float_.FloatSupplier;

@FunctionalInterface
public interface BoolToFloatFunction extends BoolApplicableLeft<FloatSupplier>, BoolApplicableRight<FloatSupplier>
{
	float apply(boolean a);
	
	@Override
	default FloatSupplier aptFirst(boolean a)
	{
		return aptLast(a);
	}
	
	@Override
	default FloatSupplier aptLast(boolean z)
	{
		return () -> apply(z);
	}
}