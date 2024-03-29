package kryptonbutterfly.functions.char_;

import kryptonbutterfly.functions.char_.applicable.CharApplicableLeft;
import kryptonbutterfly.functions.char_.applicable.CharApplicableRight;

@FunctionalInterface
public interface BiCharToLongFunction extends CharApplicableLeft<CharToLongFunction>, CharApplicableRight<CharToLongFunction>
{
	long apply(char a, char b);
	
	@Override
	default CharToLongFunction aptFirst(char a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default CharToLongFunction aptLast(char b)
	{
		return a -> apply(a, b);
	}
}