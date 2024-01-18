package kryptonbutterfly.functions.char_;

import java.util.function.IntSupplier;

import kryptonbutterfly.functions.char_.applicable.CharApplicableLeft;
import kryptonbutterfly.functions.char_.applicable.CharApplicableRight;

@FunctionalInterface
public interface CharToIntFunction extends CharApplicableLeft<IntSupplier>, CharApplicableRight<IntSupplier>
{
	int apply(char a);
	
	@Override
	default IntSupplier aptFirst(char a)
	{
		return aptLast(a);
	}
	
	@Override
	default IntSupplier aptLast(char z)
	{
		return () -> apply(z);
	}
}