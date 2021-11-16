package de.tinycodecrank.functions.short_;

import java.util.function.BooleanSupplier;

import de.tinycodecrank.functions.short_.applicable.ShortApplicableLeft;
import de.tinycodecrank.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface ShortPredicate extends ShortApplicableLeft<BooleanSupplier>, ShortApplicableRight<BooleanSupplier>
{
	boolean test(short a);
	
	@Override
	default BooleanSupplier aptFirst(short a)
	{
		return aptLast(a);
	}
	
	@Override
	default BooleanSupplier aptLast(short z)
	{
		return () -> test(z);
	}
}