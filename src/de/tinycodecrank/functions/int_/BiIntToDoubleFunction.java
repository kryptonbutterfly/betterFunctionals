package de.tinycodecrank.functions.int_;

import java.util.function.IntToDoubleFunction;

import de.tinycodecrank.functions.int_.applicable.IntApplicableLeft;
import de.tinycodecrank.functions.int_.applicable.IntApplicableRight;

@FunctionalInterface
public interface BiIntToDoubleFunction extends IntApplicableLeft<IntToDoubleFunction>, IntApplicableRight<IntToDoubleFunction>
{
	double apply(int a, int b);
	
	@Override
	default IntToDoubleFunction aptFirst(int a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default IntToDoubleFunction aptLast(int b)
	{
		return a -> apply(a, b);
	}
}