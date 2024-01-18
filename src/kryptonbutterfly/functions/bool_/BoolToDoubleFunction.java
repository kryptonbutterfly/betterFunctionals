package kryptonbutterfly.functions.bool_;

import java.util.function.DoubleSupplier;

import kryptonbutterfly.functions.bool_.applicable.BoolApplicableLeft;
import kryptonbutterfly.functions.bool_.applicable.BoolApplicableRight;

@FunctionalInterface
public interface BoolToDoubleFunction extends BoolApplicableLeft<DoubleSupplier>, BoolApplicableRight<DoubleSupplier>
{
	double apply(boolean a);
	
	@Override
	default DoubleSupplier aptFirst(boolean a)
	{
		return aptLast(a);
	}
	
	@Override
	default DoubleSupplier aptLast(boolean z)
	{
		return () -> apply(z);
	}
}