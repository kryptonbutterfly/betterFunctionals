package kryptonbutterfly.functions.void_;

import java.util.function.BiConsumer;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface BiConsumer_<T, U> extends java.util.function.BiConsumer<T, U>, ApplicableRight<U, Consumer_<T>>, ApplicableLeft<T, Consumer_<U>>
{
	@Override
	default Consumer_<T> aptLast(U u)
	{
		return t -> accept(t, u);
	}
	
	@Override
	default Consumer_<U> aptFirst(T t)
	{
		return u -> accept(t, u);
	}
	
	/**
	 * @return a Function that accepts two arguments and does nothing
	 */
	@SuppressWarnings("unchecked")
	public static <T, U> BiConsumer_<T, U> sink()
	{
		return (BiConsumer_<T, U>) SINK;
	}
	
	static final BiConsumer<?, ?> SINK = (t, u) ->
	{};
}