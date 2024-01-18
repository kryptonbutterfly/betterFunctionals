package kryptonbutterfly.functions.float_;

import java.util.function.BooleanSupplier;

import kryptonbutterfly.functions.float_.applicable.FloatApplicableLeft;
import kryptonbutterfly.functions.float_.applicable.FloatApplicableRight;

@FunctionalInterface
public interface FloatPredicate extends FloatApplicableLeft<BooleanSupplier>, FloatApplicableRight<BooleanSupplier>
{
	boolean test(float a);
	
	@Override
	default BooleanSupplier aptFirst(float a)
	{
		return aptLast(a);
	}
	
	@Override
	default BooleanSupplier aptLast(float z)
	{
		return () -> test(z);
	}
}