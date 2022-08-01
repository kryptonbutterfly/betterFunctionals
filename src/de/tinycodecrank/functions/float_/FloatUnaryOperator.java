package de.tinycodecrank.functions.float_;

import java.util.Objects;

import de.tinycodecrank.functions.ToFloatFunction;
import de.tinycodecrank.functions.float_.applicable.FloatApplicableLeft;
import de.tinycodecrank.functions.float_.applicable.FloatApplicableRight;

@FunctionalInterface
public interface FloatUnaryOperator extends FloatApplicableLeft<FloatSupplier>, FloatApplicableRight<FloatSupplier>
{
	float apply(float a);
	
	default <V> ToFloatFunction<V> compose(ToFloatFunction<? super V> before)
	{
		Objects.requireNonNull(before);
		return (V v) -> apply(before.apply(v));
	}
	
	default FloatUnaryOperator andThen(FloatUnaryOperator after)
	{
		Objects.requireNonNull(after);
		return (float value) -> after.apply(apply(value));
	}
	
	static FloatUnaryOperator indetity()
	{
		return f -> f;
	}
	
	@Override
	default FloatSupplier aptFirst(float a)
	{
		return () -> apply(a);
	}
	
	@Override
	default FloatSupplier aptLast(float z)
	{
		return () -> apply(z);
	}
	
	/**
	 * @return a Function that returns the supplied value
	 */
	public static FloatUnaryOperator identity()
	{
		return IDENTITY;
	}
	
	static final FloatUnaryOperator IDENTITY = a -> a;
}