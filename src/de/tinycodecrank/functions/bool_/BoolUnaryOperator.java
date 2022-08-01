package de.tinycodecrank.functions.bool_;

import java.util.Objects;
import java.util.function.BooleanSupplier;

import de.tinycodecrank.functions.bool_.applicable.BoolApplicableLeft;
import de.tinycodecrank.functions.bool_.applicable.BoolApplicableRight;

@FunctionalInterface
public interface BoolUnaryOperator extends BoolApplicableRight<BooleanSupplier>, BoolApplicableLeft<BooleanSupplier>
{
	boolean apply(boolean b);
	
	default BoolUnaryOperator compose(BoolUnaryOperator before)
	{
		Objects.requireNonNull(before);
		return b -> apply(before.apply(b));
	}
	
	default BoolUnaryOperator andThen(BoolUnaryOperator after)
	{
		Objects.requireNonNull(after);
		return b -> after.apply(apply(b));
	}
	
	/**
	 * @return a Function that returns the supplied value
	 */
	public static BoolUnaryOperator identity()
	{
		return IDENTITY;
	}
	
	@Override
	default BooleanSupplier aptFirst(boolean b)
	{
		return aptLast(b);
	}
	
	@Override
	default BooleanSupplier aptLast(boolean b)
	{
		return () -> apply(b);
	}
	
	static final BoolUnaryOperator IDENTITY = a -> a;
}