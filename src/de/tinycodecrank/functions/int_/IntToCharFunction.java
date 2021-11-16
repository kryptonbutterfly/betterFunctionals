package de.tinycodecrank.functions.int_;

import de.tinycodecrank.functions.char_.CharSupplier;
import de.tinycodecrank.functions.int_.applicable.IntApplicableLeft;
import de.tinycodecrank.functions.int_.applicable.IntApplicableRight;

@FunctionalInterface
public interface IntToCharFunction extends IntApplicableLeft<CharSupplier>, IntApplicableRight<CharSupplier>
{
	char apply(int a);
	
	@Override
	default CharSupplier aptFirst(int a)
	{
		return aptLast(a);
	}
	
	@Override
	default CharSupplier aptLast(int z)
	{
		return () -> apply(z);
	}
}