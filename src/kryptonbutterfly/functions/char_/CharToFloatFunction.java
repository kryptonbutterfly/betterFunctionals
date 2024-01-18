package kryptonbutterfly.functions.char_;

import kryptonbutterfly.functions.char_.applicable.CharApplicableLeft;
import kryptonbutterfly.functions.char_.applicable.CharApplicableRight;
import kryptonbutterfly.functions.float_.FloatSupplier;

@FunctionalInterface
public interface CharToFloatFunction extends CharApplicableLeft<FloatSupplier>, CharApplicableRight<FloatSupplier>
{
	float apply(char a);
	
	@Override
	default FloatSupplier aptFirst(char a)
	{
		return aptLast(a);
	}
	
	@Override
	default FloatSupplier aptLast(char z)
	{
		return () -> apply(z);
	}
}