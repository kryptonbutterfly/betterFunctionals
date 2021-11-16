package de.tinycodecrank.functions.short_;

import de.tinycodecrank.functions.byte_.ByteSupplier;
import de.tinycodecrank.functions.short_.applicable.ShortApplicableLeft;
import de.tinycodecrank.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface ShortToByteFunction extends ShortApplicableLeft<ByteSupplier>, ShortApplicableRight<ByteSupplier>
{
	byte apply(short a);
	
	@Override
	default ByteSupplier aptFirst(short a)
	{
		return aptLast(a);
	}
	
	@Override
	default ByteSupplier aptLast(short z)
	{
		return () -> apply(z);
	}
}