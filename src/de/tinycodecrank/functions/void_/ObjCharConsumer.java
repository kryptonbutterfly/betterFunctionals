package de.tinycodecrank.functions.void_;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.char_.CharConsumer;
import de.tinycodecrank.functions.char_.applicable.CharApplicableRight;

@FunctionalInterface
public interface ObjCharConsumer<A> extends ApplicableLeft<A, CharConsumer>, CharApplicableRight<Consumer_<A>>
{
	void accept(A a, char b);
	
	@Override
	default CharConsumer aptFirst(A a)
	{
		return b -> accept(a, b);
	}
	
	@Override
	default Consumer_<A> aptLast(char b)
	{
		return a -> accept(a, b);
	}
}