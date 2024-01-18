package kryptonbutterfly.functions.long_;

import kryptonbutterfly.functions.byte_.ByteSupplier;
import kryptonbutterfly.functions.long_.applicable.LongApplicableLeft;
import kryptonbutterfly.functions.long_.applicable.LongApplicableRight;

@FunctionalInterface
public interface LongToByteFunction extends LongApplicableLeft<ByteSupplier>, LongApplicableRight<ByteSupplier>
{
	byte apply(long a);
	
	@Override
	default ByteSupplier aptFirst(long a)
	{
		return aptLast(a);
	}
	
	@Override
	default ByteSupplier aptLast(long z)
	{
		return () -> apply(z);
	}
}