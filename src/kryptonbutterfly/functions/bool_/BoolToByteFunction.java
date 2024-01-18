package kryptonbutterfly.functions.bool_;

import kryptonbutterfly.functions.bool_.applicable.BoolApplicableLeft;
import kryptonbutterfly.functions.bool_.applicable.BoolApplicableRight;
import kryptonbutterfly.functions.byte_.ByteSupplier;

@FunctionalInterface
public interface BoolToByteFunction extends BoolApplicableLeft<ByteSupplier>, BoolApplicableRight<ByteSupplier>
{
	byte apply(boolean a);
	
	@Override
	default ByteSupplier aptFirst(boolean a)
	{
		return aptLast(a);
	}
	
	@Override
	default ByteSupplier aptLast(boolean z)
	{
		return () -> apply(z);
	}
}