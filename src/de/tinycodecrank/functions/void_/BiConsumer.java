package de.tinycodecrank.functions.void_;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;

public interface BiConsumer<T, U> extends java.util.function.BiConsumer<T, U>, ApplicableRight<U, Consumer<T>>, ApplicableLeft<T, Consumer<U>>
{
	@Override
	default Consumer<T> aptLast(U u)
	{
		return t -> accept(t, u);
	}
	
	@Override
	default Consumer<U> aptFirst(T t)
	{
		return u -> accept(t, u);
	}
}