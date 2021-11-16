package de.tinycodecrank.functions.short_;

import java.util.function.DoubleSupplier;

import de.tinycodecrank.functions.short_.applicable.ShortApplicableLeft;
import de.tinycodecrank.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface ShortToDoubleFunction extends ShortApplicableLeft<DoubleSupplier>, ShortApplicableRight<DoubleSupplier>
{
	double apply(short a);
	
	@Override
	default DoubleSupplier aptFirst(short a)
	{
		return aptLast(a);
	}
	
	@Override
	default DoubleSupplier aptLast(short z)
	{
		return () -> apply(z);
	}
}