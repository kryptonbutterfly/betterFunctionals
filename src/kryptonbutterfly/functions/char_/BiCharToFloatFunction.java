package kryptonbutterfly.functions.char_;

import kryptonbutterfly.functions.char_.applicable.CharApplicableLeft;
import kryptonbutterfly.functions.char_.applicable.CharApplicableRight;

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