package de.tinycodecrank.functions.bool_;

import de.tinycodecrank.functions.bool_.applicable.BoolApplicableLeft;
import de.tinycodecrank.functions.bool_.applicable.BoolApplicableRight;

@FunctionalInterface
public interface BiBoolToByteFunction extends BoolApplicableLeft<BoolToByteFunction>, BoolApplicableRight<BoolToByteFunction>
{
	byte accept(boolean a, boolean b);
	
	@Override
	default BoolToByteFunction aptFirst(boolean a)
	{
		return b -> accept(a, b);
	}
	
	@Override
	default BoolToByteFunction aptLast(boolean b)
	{
		return a -> accept(a, b);
	}
}