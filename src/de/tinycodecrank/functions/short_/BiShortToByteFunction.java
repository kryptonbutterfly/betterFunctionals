package de.tinycodecrank.functions.short_;

import de.tinycodecrank.functions.short_.applicable.ShortApplicableLeft;
import de.tinycodecrank.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface BiShortToByteFunction extends ShortApplicableLeft<ShortToByteFunction>, ShortApplicableRight<ShortToByteFunction>
{
	byte apply(short a, short b);
	
	@Override
	default ShortToByteFunction aptFirst(short a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default ShortToByteFunction aptLast(short b)
	{
		return a -> apply(a, b);
	}
}