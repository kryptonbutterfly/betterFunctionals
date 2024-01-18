package kryptonbutterfly.functions;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Function;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface MultiFunction<T, R> extends ApplicableRight<T, MultiFunction<T, R>>, ApplicableLeft<T, MultiFunction<T, R>>
{
	R apply(@SuppressWarnings("unchecked") T... t);
	
	default <V> MultiFunction<T, V> andThen(Function<? super R, ? extends V> after)
	{
		Objects.requireNonNull(after);
		return (T[] t) -> after.apply(apply(t));
	}
	
	@Override
	default MultiFunction<T, R> aptLast(T t)
	{
		return (T[] t1) ->
		{
			T[] aT = Arrays.copyOf(t1, t1.length + 1);
			aT[t1.length] = t;
			return apply(aT);
		};
	}
	
	@Override
	default MultiFunction<T, R> aptFirst(T t)
	{
		return (T[] t2) ->
		{
			T[] aT = Arrays.copyOf(t2, t2.length + 1);
			System.arraycopy(t2, 0, aT, 1, t2.length);
			aT[0] = t;
			return apply(aT);
		};
	}
}