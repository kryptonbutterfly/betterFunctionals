package de.tinycodecrank.functions.char_;

import de.tinycodecrank.functions.char_.applicable.CharApplicableLeft;
import de.tinycodecrank.functions.char_.applicable.CharApplicableRight;

@FunctionalInterface
public interface BiCharToShortFunction extends CharApplicableLeft<CharToShortFunction>, CharApplicableRight<CharToShortFunction>
{
	short apply(char a, char b);
	
	@Override
	default CharToShortFunction aptFirst(char a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default CharToShortFunction aptLast(char b)
	{
		return a -> apply(a, b);
	}
}