package de.tinycodecrank.functions.byte_;

import de.tinycodecrank.functions.byte_.applicable.ByteApplicableLeft;
import de.tinycodecrank.functions.byte_.applicable.ByteApplicableRight;
import de.tinycodecrank.functions.char_.CharSupplier;

@FunctionalInterface
public interface ByteToCharFunction extends ByteApplicableLeft<CharSupplier>, ByteApplicableRight<CharSupplier>
{
	char apply(byte a);
	
	@Override
	default CharSupplier aptFirst(byte a)
	{
		return aptLast(a);
	}

	@Override
	default CharSupplier aptLast(byte z)
	{
		return () -> apply(z);
	}
}