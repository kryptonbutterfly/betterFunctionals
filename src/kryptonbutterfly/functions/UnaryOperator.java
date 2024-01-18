package kryptonbutterfly.functions;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface UnaryOperator<T> extends ApplicableLeft<T, Runnable>, ApplicableRight<T, Runnable>
{
	T apply(T t);
	
	@Override
	default Runnable aptFirst(T t)
	{
		return aptLast(t);
	}
	
	@Override
	default Runnable aptLast(T t)
	{
		return () -> apply(t);
	}
	
	/**
	 * @return a Function that returns the supplied value
	 */
	@SuppressWarnings("unchecked")
	public static <T> UnaryOperator<T> identity()
	{
		return (UnaryOperator<T>) IDENTITY;
	}
	
	static final UnaryOperator<?> IDENTITY = a -> a;
}