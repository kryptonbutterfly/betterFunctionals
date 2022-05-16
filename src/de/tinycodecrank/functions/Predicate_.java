package de.tinycodecrank.functions;

import java.util.Objects;
import java.util.function.BooleanSupplier;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface Predicate_<T> extends java.util.function.Predicate<T>, ApplicableRight<T, BooleanSupplier>, ApplicableLeft<T, BooleanSupplier>
{
	@Override
	default Predicate_<T> and(java.util.function.Predicate<? super T> other)
	{
		Objects.requireNonNull(other);
		return t -> test(t) && other.test(t);
	}
	
	@Override
	default Predicate_<T> or(java.util.function.Predicate<? super T> other)
	{
		Objects.requireNonNull(other);
		return t -> test(t) || other.test(t);
	}
	
	@Override
	default Predicate_<T> negate()
	{
		return t -> !test(t);
	}
	
	@Override
	default BooleanSupplier aptLast(T t)
	{
		return () -> test(t);
	}
	
	@Override
	default BooleanSupplier aptFirst(T t)
	{
		return aptLast(t);
	}
}