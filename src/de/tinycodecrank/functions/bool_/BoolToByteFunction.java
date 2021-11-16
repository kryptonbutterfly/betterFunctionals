package de.tinycodecrank.functions.bool_;

import de.tinycodecrank.functions.bool_.applicable.BoolApplicableLeft;
import de.tinycodecrank.functions.bool_.applicable.BoolApplicableRight;
import de.tinycodecrank.functions.byte_.ByteSupplier;

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