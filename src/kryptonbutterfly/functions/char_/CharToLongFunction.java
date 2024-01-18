package kryptonbutterfly.functions.char_;

import java.util.function.LongSupplier;

import kryptonbutterfly.functions.char_.applicable.CharApplicableLeft;
import kryptonbutterfly.functions.char_.applicable.CharApplicableRight;

@FunctionalInterface
public interface CharToLongFunction extends CharApplicableLeft<LongSupplier>, CharApplicableRight<LongSupplier>
{
	long apply(char a);
	
	@Override
	default LongSupplier aptFirst(char a)
	{
		return aptLast(a);
	}
	
	@Override
	default LongSupplier aptLast(char z)
	{
		return () -> apply(z);
	}
}