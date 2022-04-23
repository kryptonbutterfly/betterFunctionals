package de.tinycodecrank.functions;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface BinaryOperator<T> extends ApplicableLeft<T, UnaryOperator<T>>, ApplicableRight<T, UnaryOperator<T>>
{
	T apply(T a, T z);
	
	@Override
	default UnaryOperator<T> aptFirst(T a)
	{
		return z -> apply(a, z);
	}
	
	@Override
	default UnaryOperator<T> aptLast(T z)
	{
		return a -> apply(a, z);
	}
}