package de.tinycodecrank.functions;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface Consumer<T> extends java.util.function.Consumer<T>, ApplicableRight<T, Runnable>, ApplicableLeft<T, Runnable>
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
}