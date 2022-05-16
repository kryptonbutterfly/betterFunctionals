package de.tinycodecrank.functions.void_;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;

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
}