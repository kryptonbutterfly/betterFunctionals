package de.tinycodecrank.functions.byte_;

import java.util.function.LongSupplier;

import de.tinycodecrank.functions.byte_.applicable.ByteApplicableLeft;
import de.tinycodecrank.functions.byte_.applicable.ByteApplicableRight;

@FunctionalInterface
public interface ByteToLongFunction extends ByteApplicableLeft<LongSupplier>, ByteApplicableRight<LongSupplier>
{
	long apply(byte a);
	
	@Override
	default LongSupplier aptFirst(byte a)
	{
		return aptLast(a);
	}
	
	@Override
	default LongSupplier aptLast(byte z)
	{
		return () -> apply(z);
	}
}