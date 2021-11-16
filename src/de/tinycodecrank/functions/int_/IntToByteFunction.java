package de.tinycodecrank.functions.int_;

import de.tinycodecrank.functions.byte_.ByteSupplier;
import de.tinycodecrank.functions.int_.applicable.IntApplicableLeft;
import de.tinycodecrank.functions.int_.applicable.IntApplicableRight;

@FunctionalInterface
public interface IntToByteFunction extends IntApplicableLeft<ByteSupplier>, IntApplicableRight<ByteSupplier>
{
	byte apply(int a);
	
	@Override
	default ByteSupplier aptFirst(int a)
	{
		return aptLast(a);
	}
	
	@Override
	default ByteSupplier aptLast(int z)
	{
		return () -> apply(z);
	}
}