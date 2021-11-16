package de.tinycodecrank.functions.bool_;

import de.tinycodecrank.functions.bool_.applicable.BoolApplicableLeft;
import de.tinycodecrank.functions.bool_.applicable.BoolApplicableRight;

@FunctionalInterface
public interface BiBoolToFloatFunction extends BoolApplicableLeft<BoolToFloatFunction>, BoolApplicableRight<BoolToFloatFunction>
{
	float apply(boolean a, boolean b);
	
	@Override
	default BoolToFloatFunction aptFirst(boolean a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default BoolToFloatFunction aptLast(boolean b)
	{
		return a -> apply(a, b);
	}
}