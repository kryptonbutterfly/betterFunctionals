package kryptonbutterfly.functions.long_;

import kryptonbutterfly.functions.char_.CharSupplier;
import kryptonbutterfly.functions.long_.applicable.LongApplicableLeft;
import kryptonbutterfly.functions.long_.applicable.LongApplicableRight;

@FunctionalInterface
public interface LongToCharFunction extends LongApplicableLeft<CharSupplier>, LongApplicableRight<CharSupplier>
{
	char apply(long a);
	
	@Override
	default CharSupplier aptFirst(long a)
	{
		return aptLast(a);
	}
	
	@Override
	default CharSupplier aptLast(long z)
	{
		return () -> apply(z);
	}
}