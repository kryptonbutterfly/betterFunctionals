package de.tinycodecrank.functions.float_;

import de.tinycodecrank.functions.float_.applicable.FloatApplicableLeft;
import de.tinycodecrank.functions.float_.applicable.FloatApplicableRight;

@FunctionalInterface
public interface BiFloatToByteFunction extends FloatApplicableLeft<FloatToByteFunction>, FloatApplicableRight<FloatToByteFunction>
{
	byte apply(float a, float b);
	
	@Override
	default FloatToByteFunction aptFirst(float a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default FloatToByteFunction aptLast(float b)
	{
		return a -> apply(a, b);
	}
}