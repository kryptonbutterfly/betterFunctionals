package de.tinycodecrank.functions.bool_;

import de.tinycodecrank.functions.bool_.applicable.BoolApplicableLeft;
import de.tinycodecrank.functions.bool_.applicable.BoolApplicableRight;

@FunctionalInterface
public interface BiBoolToLongFunction extends BoolApplicableLeft<BoolToLongFunction>, BoolApplicableRight<BoolToLongFunction>
{
	long apply(boolean a, boolean b);
	
	@Override
	default BoolToLongFunction aptFirst(boolean a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default BoolToLongFunction aptLast(boolean b)
	{
		return a -> apply(a, b);
	}
}