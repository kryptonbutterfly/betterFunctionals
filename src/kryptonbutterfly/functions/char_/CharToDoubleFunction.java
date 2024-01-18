package kryptonbutterfly.functions.char_;

import java.util.function.DoubleSupplier;

import kryptonbutterfly.functions.char_.applicable.CharApplicableLeft;
import kryptonbutterfly.functions.char_.applicable.CharApplicableRight;

@FunctionalInterface
public interface CharToDoubleFunction extends CharApplicableLeft<DoubleSupplier>, CharApplicableRight<DoubleSupplier>
{
	double apply(char a);
	
	@Override
	default DoubleSupplier aptFirst(char a)
	{
		return aptLast(a);
	}
	
	@Override
	default DoubleSupplier aptLast(char z)
	{
		return () -> apply(z);
	}
}