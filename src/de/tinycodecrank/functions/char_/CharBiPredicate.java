package de.tinycodecrank.functions.char_;

import de.tinycodecrank.functions.char_.applicable.CharApplicableLeft;
import de.tinycodecrank.functions.char_.applicable.CharApplicableRight;

@FunctionalInterface
public interface CharBiPredicate extends CharApplicableLeft<CharPredicate>, CharApplicableRight<CharPredicate>
{
	boolean test(char a, char b);
	
	@Override
	default CharPredicate aptFirst(char a)
	{
		return b -> test(a, b);
	}
	
	@Override
	default CharPredicate aptLast(char b)
	{
		return a -> test(a, b);
	}
}