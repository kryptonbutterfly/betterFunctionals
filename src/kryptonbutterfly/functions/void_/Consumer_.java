package kryptonbutterfly.functions.void_;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface Consumer_<T> extends java.util.function.Consumer<T>, ApplicableRight<T, Runnable>, ApplicableLeft<T, Runnable>
{
	@Override
	default Runnable aptLast(T t)
	{
		return () -> accept(t);
	}
	
	@Override
	default Runnable aptFirst(T t)
	{
		return aptLast(t);
	}
	
	/**
	 * @return a Function that accepts an argument and does nothing
	 */
	@SuppressWarnings("unchecked")
	public static <T> Consumer_<T> sink()
	{
		return (Consumer_<T>) SINK;
	}
	
	static final Consumer_<?> SINK = (t) ->
	{};
}