package kryptonbutterfly.functions.byte_;

import java.util.function.IntSupplier;

import kryptonbutterfly.functions.byte_.applicable.ByteApplicableLeft;
import kryptonbutterfly.functions.byte_.applicable.ByteApplicableRight;

@FunctionalInterface
public interface ByteToIntFunction extends ByteApplicableLeft<IntSupplier>, ByteApplicableRight<IntSupplier>
{
	int apply(byte a);
	
	@Override
	default IntSupplier aptFirst(byte a)
	{
		return aptLast(a);
	}
	
	@Override
	default IntSupplier aptLast(byte z)
	{
		return () -> apply(z);
	}
}