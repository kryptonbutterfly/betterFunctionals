package kryptonbutterfly.functions;

import java.util.function.Supplier;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface Function_<T, R> extends java.util.function.Function<T, R>, ApplicableRight<T, Supplier<R>>, ApplicableLeft<T, Supplier<R>>
{
	@Override
	default Supplier<R> aptFirst(T t)
	{
		return () -> apply(t);
	}
	
	@Override
	default Supplier<R> aptLast(T t)
	{
		return () -> apply(t);
	}
	
	/**
	 * @return a Function that returns the supplied value
	 */
	@SuppressWarnings("unchecked")
	public static <T> Function_<T, T> identity()
	{
		return (Function_<T, T>) IDENTITY;
	}
	
	static final Function_<?, ?> IDENTITY = a -> a;
}