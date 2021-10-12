package de.tinycodecrank.functions.bool_;

import java.util.function.Supplier;

import de.tinycodecrank.functions.bool_.applicable.BoolApplicableLeft;
import de.tinycodecrank.functions.bool_.applicable.BoolApplicableRight;

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