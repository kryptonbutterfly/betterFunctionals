package de.tinycodecrank.functions.char_;

import de.tinycodecrank.functions.byte_.ByteSupplier;
import de.tinycodecrank.functions.char_.applicable.CharApplicableLeft;
import de.tinycodecrank.functions.char_.applicable.CharApplicableRight;

@FunctionalInterface
public interface CharToByteFunction extends CharApplicableLeft<ByteSupplier>, CharApplicableRight<ByteSupplier>
{
	byte apply(char a);
	
	@Override
	default ByteSupplier aptFirst(char a)
	{
		return aptLast(a);
	}
	
	@Override
	default ByteSupplier aptLast(char z)
	{
		return () -> apply(z);
	}
}