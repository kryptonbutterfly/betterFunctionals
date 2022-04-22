package de.tinycodecrank.functions;

import java.util.Arrays;
import java.util.Objects;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface MultiPredicate<T> extends ApplicableLeft<T, MultiPredicate<T>>, ApplicableRight<T, MultiPredicate<T>>
{
	boolean test(@SuppressWarnings("unchecked") T... t);
	
	default MultiPredicate<T> and(MultiPredicate<? super T> other)
	{
		Objects.requireNonNull(other);
		return (@SuppressWarnings("unchecked") T... t) -> test(t) && other.test(t);
	}
	
	default MultiPredicate<T> negate()
	{
		return (@SuppressWarnings("unchecked") T... t) -> !test(t);
	}
	
	default MultiPredicate<T> or(MultiPredicate<? super T> other)
	{
		Objects.requireNonNull(other);
		return (@SuppressWarnings("unchecked") T... t) -> test(t) || other.test(t);
	}
	
	@Override
	default MultiPredicate<T> aptFirst(T t)
	{
		return (@SuppressWarnings("unchecked") T... t2) ->
		{
			T[] aT = Arrays.copyOf(t2, t2.length + 1);
			System.arraycopy(t2, 0, aT, 1, t2.length);
			aT[0] = t;
			return test(aT);
		};
	}
	
	@Override
	default MultiPredicate<T> aptLast(T t)
	{
		return (@SuppressWarnings("unchecked") T... t1) ->
		{
			T[] aT = Arrays.copyOf(t1, t1.length + 1);
			aT[t1.length] = t;
			return test(aT);
		};
	}
}