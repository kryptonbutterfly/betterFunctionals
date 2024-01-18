package kryptonbutterfly.functions.short_;

import kryptonbutterfly.functions.float_.FloatSupplier;
import kryptonbutterfly.functions.short_.applicable.ShortApplicableLeft;
import kryptonbutterfly.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface ShortToFloatFunction extends ShortApplicableLeft<FloatSupplier>, ShortApplicableRight<FloatSupplier>
{
	float apply(short a);
	
	@Override
	default FloatSupplier aptFirst(short a)
	{
		return aptLast(a);
	}
	
	@Override
	default FloatSupplier aptLast(short z)
	{
		return () -> apply(z);
	}
}