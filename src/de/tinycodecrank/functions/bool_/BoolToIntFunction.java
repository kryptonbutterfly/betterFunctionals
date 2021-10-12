package de.tinycodecrank.functions.bool_;

import java.util.function.IntSupplier;

import de.tinycodecrank.functions.bool_.applicable.BoolApplicableLeft;
import de.tinycodecrank.functions.bool_.applicable.BoolApplicableRight;

@FunctionalInterface
public interface BoolToIntFunction extends BoolApplicableLeft<IntSupplier>, BoolApplicableRight<IntSupplier>
{
	public int apply(boolean bit);
	
	@Override
	default IntSupplier aptFirst(boolean a)
	{
		return () -> apply(a);
	}
	
	@Override
	default IntSupplier aptLast(boolean z)
	{
		return () -> apply(z);
	}
}