package kryptonbutterfly.functions.bool_;

import java.util.function.Supplier;

import kryptonbutterfly.functions.bool_.applicable.BoolApplicableLeft;
import kryptonbutterfly.functions.bool_.applicable.BoolApplicableRight;

@FunctionalInterface
public interface BoolFunction<T> extends BoolApplicableLeft<Supplier<T>>, BoolApplicableRight<Supplier<T>>
{
	public T apply(boolean b);
	
	@Override
	public default Supplier<T> aptFirst(boolean a)
	{
		return () -> apply(a);
	}
	
	@Override
	default Supplier<T> aptLast(boolean z)
	{
		return () -> apply(z);
	}
}