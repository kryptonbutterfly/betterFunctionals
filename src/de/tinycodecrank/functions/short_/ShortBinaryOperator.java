package de.tinycodecrank.functions.short_;

import de.tinycodecrank.functions.short_.applicable.ShortApplicableLeft;
import de.tinycodecrank.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface ShortBinaryOperator extends ShortApplicableLeft<ShortUnaryOperator>, ShortApplicableRight<ShortUnaryOperator>
{
	short apply(short a, short b);
	
	@Override
	default ShortUnaryOperator aptFirst(short a)
	{
		return z -> apply(a, z);
	}
	
	@Override
	default ShortUnaryOperator aptLast(short z)
	{
		return a -> apply(a, z);
	}
}