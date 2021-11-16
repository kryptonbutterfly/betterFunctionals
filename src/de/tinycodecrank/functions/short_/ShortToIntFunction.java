package de.tinycodecrank.functions.short_;

import java.util.function.IntSupplier;

import de.tinycodecrank.functions.short_.applicable.ShortApplicableLeft;
import de.tinycodecrank.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface ShortToIntFunction extends ShortApplicableLeft<IntSupplier>, ShortApplicableRight<IntSupplier>
{
	int apply(short a);
	
	@Override
	default IntSupplier aptFirst(short a)
	{
		return aptLast(a);
	}
	
	@Override
	default IntSupplier aptLast(short z)
	{
		return () -> apply(z);
	}
}