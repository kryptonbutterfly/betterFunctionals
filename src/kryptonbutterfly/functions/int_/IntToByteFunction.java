package kryptonbutterfly.functions.int_;

import kryptonbutterfly.functions.byte_.ByteSupplier;
import kryptonbutterfly.functions.int_.applicable.IntApplicableLeft;
import kryptonbutterfly.functions.int_.applicable.IntApplicableRight;

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