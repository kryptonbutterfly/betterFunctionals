package de.tinycodecrank.functions.float_;

import de.tinycodecrank.functions.float_.applicable.FloatApplicableLeft;
import de.tinycodecrank.functions.float_.applicable.FloatApplicableRight;

@FunctionalInterface
public interface BiFloatToShortFunction extends FloatApplicableLeft<FloatToShortFunction>, FloatApplicableRight<FloatToShortFunction>
{
	short apply(float a, float b);
	
	@Override
	default FloatToShortFunction aptFirst(float a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default FloatToShortFunction aptLast(float b)
	{
		return a -> apply(a, b);
	}
}