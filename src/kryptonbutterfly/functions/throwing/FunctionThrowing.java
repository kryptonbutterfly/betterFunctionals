package kryptonbutterfly.functions.throwing;

import java.util.Objects;
import java.util.function.Function;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.applicable.ApplicableRight;

@FunctionalInterface
public interface FunctionThrowing<T, R, E extends Throwable> extends ApplicableRight<T, SupplierThrowing<R, E>>, ApplicableLeft<T, SupplierThrowing<R, E>>
{
	R apply(T t) throws E;
	
	default <V> FunctionThrowing<T, V, E> andThen(FunctionThrowing<? super R, ? extends V, ? extends E> after)
	{
		Objects.requireNonNull(after);
		return (T t) -> after.apply(apply(t));
	}
	
	default <V> FunctionThrowing<V, R, E> compose(FunctionThrowing<? super V, ? extends T, ? extends E> before)
	{
		Objects.requireNonNull(before);
		return (V v) -> apply(before.apply(v));
	}
	
	default <V> FunctionThrowing<V, R, E> compose(Function<? super V, ? extends T> before)
	{
		Objects.requireNonNull(before);
		return (V v) -> apply(before.apply(v));
	}
	
	@Override
	default SupplierThrowing<R, E> aptLast(T t)
	{
		return () -> apply(t);
	}
	
	@Override
	default SupplierThrowing<R, E> aptFirst(T t)
	{
		return aptLast(t);
	}
}