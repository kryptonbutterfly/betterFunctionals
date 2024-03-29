package kryptonbutterfly.functions;

import java.util.Objects;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface TriPredicate<T, U, V> extends ApplicableLeft<T, BiPredicate_<U, V>>, ApplicableRight<V, BiPredicate_<T, U>>
{
	boolean test(T t, U u, V v);
	
	default TriPredicate<T, U, V> and(TriPredicate<? super T, ? super U, ? super V> other)
	{
		Objects.requireNonNull(other);
		return (T t, U u, V v) -> test(t, u, v) && other.test(t, u, v);
	}
	
	default TriPredicate<T, U, V> negate()
	{
		return (T t, U u, V v) -> !test(t, u, v);
	}
	
	default TriPredicate<T, U, V> or(TriPredicate<? super T, ? super U, ? super V> other)
	{
		Objects.requireNonNull(other);
		return (T t, U u, V v) -> test(t, u, v) || other.test(t, u, v);
	}
	
	@Override
	default BiPredicate_<U, V> aptFirst(T t)
	{
		return (U u, V v) -> test(t, u, v);
	}
	
	@Override
	default BiPredicate_<T, U> aptLast(V v)
	{
		return (T t, U u) -> test(t, u, v);
	}
}