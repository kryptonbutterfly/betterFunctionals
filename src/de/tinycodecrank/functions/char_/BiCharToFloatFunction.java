package de.tinycodecrank.functions.char_;

import de.tinycodecrank.functions.char_.applicable.CharApplicableLeft;
import de.tinycodecrank.functions.char_.applicable.CharApplicableRight;

@FunctionalInterface
public interface BiCharToFloatFunction extends CharApplicableLeft<CharToFloatFunction>, CharApplicableRight<CharToFloatFunction>
{
	float apply(char a, char b);
	
	@Override
	default CharToFloatFunction aptFirst(char a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default CharToFloatFunction aptLast(char b)
	{
		return a -> apply(a, b);
	}
}