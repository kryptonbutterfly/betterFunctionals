package de.tinycodecrank.functions.int_;

import java.util.Arrays;
import java.util.Objects;

import de.tinycodecrank.functions.MultiConsumer;
import de.tinycodecrank.functions.applicable.ApplicableRight;
import de.tinycodecrank.functions.int_.applicable.IntApplicableLeft;

@FunctionalInterface
public interface IntMultiConsumer<T> extends IntApplicableLeft<MultiConsumer<T>>, ApplicableRight<T, IntMultiConsumer<T>>
{
	void accept(int value, @SuppressWarnings("unchecked") T... t);
	
	default IntMultiConsumer<T> andThen(IntMultiConsumer<? super T> after)
	{
		Objects.requireNonNull(after);
		return (int value, @SuppressWarnings("unchecked") T... t) ->
		{
			accept(value, t);
			after.accept(value, t);
		};
	}
	
	@Override
	default IntMultiConsumer<T> aptLast(T t)
	{
		return (int value, T[] t1) ->
		{
			T[] aT = Arrays.copyOf(t1, t1.length + 1);
			aT[t1.length] = t;
			this.accept(value, aT);
		};
	}
	
	@Override
	default MultiConsumer<T> aptFirst(int value)
	{
		return t -> accept(value, t);
	}
}