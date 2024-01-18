package kryptonbutterfly.functions.byte_;

import java.util.function.Supplier;

import kryptonbutterfly.functions.byte_.applicable.ByteApplicableLeft;
import kryptonbutterfly.functions.byte_.applicable.ByteApplicableRight;

@FunctionalInterface
public interface ByteFunction<R> extends ByteApplicableLeft<Supplier<R>>, ByteApplicableRight<Supplier<R>>
{
	R apply(byte a);
	
	@Override
	default Supplier<R> aptFirst(byte a)
	{
		return aptLast(a);
	}
	
	@Override
	default Supplier<R> aptLast(byte z)
	{
		return () -> apply(z);
	}
}