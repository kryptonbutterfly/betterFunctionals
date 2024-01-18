package kryptonbutterfly.functions.double_;

import kryptonbutterfly.functions.char_.CharSupplier;
import kryptonbutterfly.functions.double_.applicable.DoubleApplicableLeft;
import kryptonbutterfly.functions.double_.applicable.DoubleApplicableRight;

@FunctionalInterface
public interface DoubleToCharFunction extends DoubleApplicableLeft<CharSupplier>, DoubleApplicableRight<CharSupplier>
{
	char apply(double a);
	
	@Override
	default CharSupplier aptFirst(double a)
	{
		return aptLast(a);
	}
	
	@Override
	default CharSupplier aptLast(double z)
	{
		return () -> apply(z);
	}
}