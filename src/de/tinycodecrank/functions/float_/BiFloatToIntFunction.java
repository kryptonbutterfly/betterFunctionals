package de.tinycodecrank.functions.float_;

import de.tinycodecrank.functions.float_.applicable.FloatApplicableLeft;
import de.tinycodecrank.functions.float_.applicable.FloatApplicableRight;

@FunctionalInterface
public interface BiFloatToIntFunction extends FloatApplicableLeft<FloatToIntFunction>, FloatApplicableRight<FloatToIntFunction>
{
	int apply(float a, float b);
	
	@Override
	default FloatToIntFunction aptFirst(float a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default FloatToIntFunction aptLast(float b)
	{
		return a -> apply(a, b);
	}
}