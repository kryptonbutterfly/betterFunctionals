package de.tinycodecrank.functions.void_;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableVarargsRight;

public interface VarargsBiConsumer<T, U> extends ApplicableLeft<T, MultiConsumer<U>>, ApplicableVarargsRight<U, Consumer<T>>
{
	void accept(T t, @SuppressWarnings("unchecked") U... u);
	
	@Override
	default MultiConsumer<U> aptFirst(T t)
	{
		return u -> accept(t, u);
	}
	
	@Override
	default Consumer<T> aptLast(@SuppressWarnings("unchecked") U... u)
	{
		return t -> accept(t, u);
	}
}