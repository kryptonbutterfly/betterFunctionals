package de.tinycodecrank.functions.char_;

import java.util.function.Supplier;

import de.tinycodecrank.functions.char_.applicable.CharApplicableLeft;
import de.tinycodecrank.functions.char_.applicable.CharApplicableRight;

@FunctionalInterface
public interface CharFunction<R> extends CharApplicableLeft<Supplier<R>>, CharApplicableRight<Supplier<R>>
{
	R apply(char a);
	
	@Override
	default Supplier<R> aptFirst(char a)
	{
		return aptLast(a);
	}
	
	@Override
	default Supplier<R> aptLast(char z)
	{
		return () -> apply(z);
	}
}