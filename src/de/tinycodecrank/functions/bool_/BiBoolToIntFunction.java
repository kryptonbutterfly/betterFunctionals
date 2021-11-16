package de.tinycodecrank.functions.bool_;

import de.tinycodecrank.functions.bool_.applicable.BoolApplicableLeft;
import de.tinycodecrank.functions.bool_.applicable.BoolApplicableRight;

@FunctionalInterface
public interface BiBoolToIntFunction extends BoolApplicableLeft<BoolToIntFunction>, BoolApplicableRight<BoolToIntFunction>
{
	int apply(boolean a, boolean b);
	
	@Override
	default BoolToIntFunction aptFirst(boolean a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default BoolToIntFunction aptLast(boolean b)
	{
		return a -> apply(a, b);
	}
}