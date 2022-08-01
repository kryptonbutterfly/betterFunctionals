package de.tinycodecrank.functions.void_;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableVarargsRight;

@FunctionalInterface
public interface VarargsBiConsumer<T, U> extends ApplicableLeft<T, MultiConsumer<U>>, ApplicableVarargsRight<U, Consumer_<T>>
{
	void accept(T t, @SuppressWarnings("unchecked") U... u);
	
	@Override
	default MultiConsumer<U> aptFirst(T t)
	{
		return u -> accept(t, u);
	}
	
	@Override
	default Consumer_<T> aptLast(@SuppressWarnings("unchecked") U... u)
	{
		return t -> accept(t, u);
	}
	
	/**
	 * @return a Function that accepts at least one argument and does nothing
	 */
	@SuppressWarnings("unchecked")
	public static <T, U> VarargsBiConsumer<T, U> sink()
	{
		return (VarargsBiConsumer<T, U>) SINK;
	}
	
	static final VarargsBiConsumer<?, ?> SINK = (a, b) ->
	{};
}