package kryptonbutterfly.functions.bool_;

import kryptonbutterfly.functions.bool_.applicable.BoolApplicableLeft;
import kryptonbutterfly.functions.bool_.applicable.BoolApplicableRight;
import kryptonbutterfly.functions.float_.FloatSupplier;

@FunctionalInterface
public interface BoolToFloatFunction extends BoolApplicableLeft<FloatSupplier>, BoolApplicableRight<FloatSupplier>
{
	float apply(boolean a);
	
	@Override
	default FloatSupplier aptFirst(boolean a)
	{
		return aptLast(a);
	}
	
	@Override
	default FloatSupplier aptLast(boolean z)
	{
		return () -> apply(z);
	}
}