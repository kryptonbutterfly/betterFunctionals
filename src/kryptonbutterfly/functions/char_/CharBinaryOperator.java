package kryptonbutterfly.functions.char_;

import kryptonbutterfly.functions.char_.applicable.CharApplicableLeft;
import kryptonbutterfly.functions.char_.applicable.CharApplicableRight;

@FunctionalInterface
public interface CharBinaryOperator extends CharApplicableRight<CharUnaryOperator>, CharApplicableLeft<CharUnaryOperator>
{
	char apply(char a, char b);
	
	@Override
	default CharUnaryOperator aptFirst(char a)
	{
		return z -> apply(a, z);
	}
	
	@Override
	default CharUnaryOperator aptLast(char z)
	{
		return a -> apply(a, z);
	}
}