package kryptonbutterfly.functions.char_;

import kryptonbutterfly.functions.char_.applicable.CharApplicableLeft;
import kryptonbutterfly.functions.char_.applicable.CharApplicableRight;

@FunctionalInterface
public interface BiCharToByteFunction extends CharApplicableLeft<CharToByteFunction>, CharApplicableRight<CharToByteFunction>
{
	byte apply(char a, char b);
	
	@Override
	default CharToByteFunction aptFirst(char a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default CharToByteFunction aptLast(char b)
	{
		return a -> apply(a, b);
	}
}