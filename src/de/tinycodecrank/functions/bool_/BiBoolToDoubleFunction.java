package de.tinycodecrank.functions.bool_;

import de.tinycodecrank.functions.bool_.applicable.BoolApplicableLeft;
import de.tinycodecrank.functions.bool_.applicable.BoolApplicableRight;

@FunctionalInterface
public interface BiBoolToDoubleFunction extends BoolApplicableLeft<BoolToDoubleFunction>, BoolApplicableRight<BoolToDoubleFunction>
{
	double apply(boolean a, boolean b);
	
	@Override
	default BoolToDoubleFunction aptFirst(boolean a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default BoolToDoubleFunction aptLast(boolean b)
	{
		return a -> apply(a, b);
	}
}