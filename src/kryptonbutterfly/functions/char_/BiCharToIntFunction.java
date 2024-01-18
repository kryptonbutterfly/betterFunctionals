package kryptonbutterfly.functions.char_;

import kryptonbutterfly.functions.char_.applicable.CharApplicableLeft;
import kryptonbutterfly.functions.char_.applicable.CharApplicableRight;

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