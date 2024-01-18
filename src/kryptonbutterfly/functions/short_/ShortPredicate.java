package kryptonbutterfly.functions.short_;

import java.util.function.BooleanSupplier;

import kryptonbutterfly.functions.short_.applicable.ShortApplicableLeft;
import kryptonbutterfly.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface ShortPredicate extends ShortApplicableLeft<BooleanSupplier>, ShortApplicableRight<BooleanSupplier>
{
	boolean test(short a);
	
	@Override
	default BooleanSupplier aptFirst(short a)
	{
		return aptLast(a);
	}
	
	@Override
	default BooleanSupplier aptLast(short z)
	{
		return () -> test(z);
	}
}