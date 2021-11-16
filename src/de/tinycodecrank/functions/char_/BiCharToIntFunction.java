package de.tinycodecrank.functions.char_;

import de.tinycodecrank.functions.char_.applicable.CharApplicableLeft;
import de.tinycodecrank.functions.char_.applicable.CharApplicableRight;

@FunctionalInterface
public interface BiCharToIntFunction extends CharApplicableLeft<CharToIntFunction>, CharApplicableRight<CharToIntFunction>
{
	int apply(char a, char b);
	
	@Override
	default CharToIntFunction aptFirst(char a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default CharToIntFunction aptLast(char b)
	{
		return a -> apply(a, b);
	}
}