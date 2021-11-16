package de.tinycodecrank.functions.byte_;

import java.util.function.BooleanSupplier;

import de.tinycodecrank.functions.byte_.applicable.ByteApplicableLeft;
import de.tinycodecrank.functions.byte_.applicable.ByteApplicableRight;

@FunctionalInterface
public interface BytePredicate extends ByteApplicableLeft<BooleanSupplier>, ByteApplicableRight<BooleanSupplier>
{
	boolean test(byte a);
	
	@Override
	default BooleanSupplier aptFirst(byte a)
	{
		return aptLast(a);
	}
	
	@Override
	default BooleanSupplier aptLast(byte z)
	{
		return () -> test(z);
	}
}