package de.tinycodecrank.functions.short_;

import de.tinycodecrank.functions.short_.applicable.ShortApplicableLeft;
import de.tinycodecrank.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface BiShortToIntFunction extends ShortApplicableLeft<ShortToIntFunction>, ShortApplicableRight<ShortToIntFunction>
{
	int apply(short a, short b);
	
	@Override
	default ShortToIntFunction aptFirst(short a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default ShortToIntFunction aptLast(short b)
	{
		return a -> apply(a, b);
	}
}