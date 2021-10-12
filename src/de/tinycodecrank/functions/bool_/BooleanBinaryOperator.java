package de.tinycodecrank.functions.bool_;

import java.util.Objects;

import de.tinycodecrank.functions.bool_.applicable.BoolApplicableLeft;
import de.tinycodecrank.functions.bool_.applicable.BoolApplicableRight;

@FunctionalInterface
public interface BooleanBinaryOperator extends BoolApplicableRight<BoolUnaryOperator>, BoolApplicableLeft<BoolUnaryOperator>
{
	boolean apply(boolean b1, boolean b2);
	
	default BooleanBinaryOperator andThen(BoolUnaryOperator after)
	{
		Objects.requireNonNull(after);
		return (b1, b2) -> after.apply(apply(b1, b2));
	}
	
	@Override
	default BoolUnaryOperator aptLast(boolean b)
	{
		return b1 -> apply(b1, b);
	}
	
	@Override
	default BoolUnaryOperator aptFirst(boolean b)
	{
		return b2 -> apply(b, b2);
	}
}