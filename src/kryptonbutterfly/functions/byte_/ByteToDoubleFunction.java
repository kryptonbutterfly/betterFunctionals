package kryptonbutterfly.functions.byte_;

import java.util.function.DoubleSupplier;

import kryptonbutterfly.functions.byte_.applicable.ByteApplicableLeft;
import kryptonbutterfly.functions.byte_.applicable.ByteApplicableRight;

@FunctionalInterface
public interface ByteToDoubleFunction extends ByteApplicableLeft<DoubleSupplier>, ByteApplicableRight<DoubleSupplier>
{
	double apply(byte a);
	
	@Override
	default DoubleSupplier aptFirst(byte a)
	{
		return aptLast(a);
	}
	
	@Override
	default DoubleSupplier aptLast(byte z)
	{
		return () -> apply(z);
	}
}