package de.tinycodecrank.functions.int_;

import java.util.function.IntToLongFunction;

import de.tinycodecrank.functions.int_.applicable.IntApplicableLeft;
import de.tinycodecrank.functions.int_.applicable.IntApplicableRight;

@FunctionalInterface
public interface BiIntToLongFunction extends IntApplicableLeft<IntToLongFunction>, IntApplicableRight<IntToLongFunction>
{
	long apply(int a, int b);
	
	@Override
	default IntToLongFunction aptFirst(int a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default IntToLongFunction aptLast(int b)
	{
		return a -> apply(a, b);
	}
}