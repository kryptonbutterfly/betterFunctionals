package de.tinycodecrank.functions.short_;

import de.tinycodecrank.functions.short_.applicable.ShortApplicableLeft;
import de.tinycodecrank.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface ShortBiPredicate extends ShortApplicableLeft<ShortPredicate>, ShortApplicableRight<ShortPredicate>
{
	boolean test(short a, short b);
	
	@Override
	default ShortPredicate aptFirst(short a)
	{
		return b -> test(a, b);
	}
	
	@Override
	default ShortPredicate aptLast(short b)
	{
		return a -> test(a, b);
	}
}