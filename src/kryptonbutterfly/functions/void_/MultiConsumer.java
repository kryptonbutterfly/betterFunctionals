package kryptonbutterfly.functions.void_;

import java.util.Arrays;
import java.util.Objects;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface MultiConsumer<T> extends ApplicableRight<T, MultiConsumer<T>>, ApplicableLeft<T, MultiConsumer<T>>
{
	void accept(@SuppressWarnings("unchecked") T... t);
	
	default MultiConsumer<T> andThen(MultiConsumer<? super T> after)
	{
		Objects.requireNonNull(after);
		return (T[] t) ->
		{
			accept(t);
			after.accept(t);
		};
	}
	
	@Override
	default MultiConsumer<T> aptLast(T t)
	{
		return (T[] t1) ->
		{
			T[] aT = Arrays.copyOf(t1, t1.length + 1);
			aT[t1.length] = t;
			this.accept(aT);
		};
	}
	
	@Override
	default MultiConsumer<T> aptFirst(T t)
	{
		return (T[] t2) ->
		{
			T[] at = Arrays.copyOf(t2, t2.length + 1);
			System.arraycopy(t2, 0, at, 1, t2.length);
			at[0] = t;
			this.accept(at);
		};
	}
	
	/**
	 * @return a Function that accepts arguments and does nothing
	 */
	@SuppressWarnings("unchecked")
	public static <T> MultiConsumer<T> sink()
	{
		return (MultiConsumer<T>) SINK;
	}
	
	static final MultiConsumer<?> SINK = (t) ->
	{};
}