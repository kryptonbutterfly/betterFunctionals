package kryptonbutterfly.functions.byte_;

import kryptonbutterfly.functions.byte_.applicable.ByteApplicableLeft;
import kryptonbutterfly.functions.byte_.applicable.ByteApplicableRight;
import kryptonbutterfly.functions.char_.CharSupplier;

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