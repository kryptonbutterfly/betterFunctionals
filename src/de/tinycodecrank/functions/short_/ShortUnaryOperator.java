package de.tinycodecrank.functions.short_;

import de.tinycodecrank.functions.short_.applicable.ShortApplicableLeft;
import de.tinycodecrank.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface ShortUnaryOperator extends ShortApplicableLeft<ShortSupplier>, ShortApplicableRight<ShortSupplier>
{
	short apply(short a);
	
	@Override
	default ShortSupplier aptFirst(short a)
	{
		return aptLast(a);
	}
	
	@Override
	default ShortSupplier aptLast(short z)
	{
		return () -> apply(z);
	}
}