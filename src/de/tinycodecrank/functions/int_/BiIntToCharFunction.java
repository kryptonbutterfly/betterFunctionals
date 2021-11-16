package de.tinycodecrank.functions.int_;

import de.tinycodecrank.functions.int_.applicable.IntApplicableLeft;
import de.tinycodecrank.functions.int_.applicable.IntApplicableRight;

@FunctionalInterface
public interface BiIntToCharFunction extends IntApplicableLeft<IntToCharFunction>, IntApplicableRight<IntToCharFunction>
{
	char apply(int a, int b);
	
	@Override
	default IntToCharFunction aptFirst(int a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default IntToCharFunction aptLast(int b)
	{
		return a -> apply(a, b);
	}
}