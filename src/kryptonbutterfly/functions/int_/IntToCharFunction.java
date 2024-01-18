package kryptonbutterfly.functions.int_;

import kryptonbutterfly.functions.char_.CharSupplier;
import kryptonbutterfly.functions.int_.applicable.IntApplicableLeft;
import kryptonbutterfly.functions.int_.applicable.IntApplicableRight;

@FunctionalInterface
public interface IntToCharFunction extends IntApplicableLeft<CharSupplier>, IntApplicableRight<CharSupplier>
{
	char apply(int a);
	
	@Override
	default CharSupplier aptFirst(int a)
	{
		return aptLast(a);
	}
	
	@Override
	default CharSupplier aptLast(int z)
	{
		return () -> apply(z);
	}
}