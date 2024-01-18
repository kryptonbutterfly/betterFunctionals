package kryptonbutterfly.functions.char_;

import kryptonbutterfly.functions.char_.applicable.CharApplicableLeft;
import kryptonbutterfly.functions.char_.applicable.CharApplicableRight;

@FunctionalInterface
public interface BiCharToDoubleFunction extends CharApplicableLeft<CharToDoubleFunction>, CharApplicableRight<CharToDoubleFunction>
{
	double apply(char a, char b);
	
	@Override
	default CharToDoubleFunction aptFirst(char a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default CharToDoubleFunction aptLast(char b)
	{
		return a -> apply(a, b);
	}
}