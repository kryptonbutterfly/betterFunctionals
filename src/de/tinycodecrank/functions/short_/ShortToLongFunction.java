package de.tinycodecrank.functions.short_;

import java.util.function.LongSupplier;

import de.tinycodecrank.functions.short_.applicable.ShortApplicableLeft;
import de.tinycodecrank.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface ShortToLongFunction extends ShortApplicableLeft<LongSupplier>, ShortApplicableRight<LongSupplier>
{
	long apply(short a);
	
	@Override
	default LongSupplier aptFirst(short a)
	{
		return aptLast(a);
	}
	
	@Override
	default LongSupplier aptLast(short z)
	{
		return () -> apply(z);
	}
}