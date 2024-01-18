package kryptonbutterfly.functions.char_;

import kryptonbutterfly.functions.char_.applicable.CharApplicableLeft;
import kryptonbutterfly.functions.char_.applicable.CharApplicableRight;

@FunctionalInterface
public interface BiCharFunction<R> extends CharApplicableLeft<CharFunction<R>>, CharApplicableRight<CharFunction<R>>
{
	R apply(char a, char b);
	
	@Override
	default CharFunction<R> aptFirst(char a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default CharFunction<R> aptLast(char b)
	{
		return a -> apply(a, b);
	}
}