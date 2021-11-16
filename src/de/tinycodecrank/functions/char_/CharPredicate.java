package de.tinycodecrank.functions.char_;

import java.util.function.BooleanSupplier;

import de.tinycodecrank.functions.char_.applicable.CharApplicableLeft;
import de.tinycodecrank.functions.char_.applicable.CharApplicableRight;

@FunctionalInterface
public interface CharPredicate extends CharApplicableLeft<BooleanSupplier>, CharApplicableRight<BooleanSupplier>
{
	boolean test(char a);
	
	@Override
	default BooleanSupplier aptFirst(char a)
	{
		return aptLast(a);
	}
	
	@Override
	default BooleanSupplier aptLast(char z)
	{
		return () -> test(z);
	}
}