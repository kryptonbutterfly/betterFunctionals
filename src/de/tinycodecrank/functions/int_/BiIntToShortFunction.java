package de.tinycodecrank.functions.int_;

import de.tinycodecrank.functions.int_.applicable.IntApplicableLeft;
import de.tinycodecrank.functions.int_.applicable.IntApplicableRight;

@FunctionalInterface
public interface BiIntToShortFunction extends IntApplicableLeft<IntToShortFunction>, IntApplicableRight<IntToShortFunction>
{
	short apply(int a, int b);
	
	@Override
	default IntToShortFunction aptFirst(int a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default IntToShortFunction aptLast(int b)
	{
		return a -> apply(a, b);
	}
}