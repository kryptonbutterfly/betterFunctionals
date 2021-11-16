package de.tinycodecrank.functions.double_;

import de.tinycodecrank.functions.char_.CharSupplier;
import de.tinycodecrank.functions.double_.applicable.DoubleApplicableLeft;
import de.tinycodecrank.functions.double_.applicable.DoubleApplicableRight;

@FunctionalInterface
public interface DoubleToCharFunction extends DoubleApplicableLeft<CharSupplier>, DoubleApplicableRight<CharSupplier>
{
	char apply(double a);
	
	@Override
	default CharSupplier aptFirst(double a)
	{
		return aptLast(a);
	}
	
	@Override
	default CharSupplier aptLast(double z)
	{
		return () -> apply(z);
	}
}