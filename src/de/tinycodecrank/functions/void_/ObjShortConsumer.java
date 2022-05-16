package de.tinycodecrank.functions.void_;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.short_.ShortConsumer;
import de.tinycodecrank.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface ObjShortConsumer<A> extends ApplicableLeft<A, ShortConsumer>, ShortApplicableRight<Consumer_<A>>
{
	void accept(A a, short b);
	
	@Override
	default ShortConsumer aptFirst(A a)
	{
		return b -> accept(a, b);
	}
	
	@Override
	default Consumer_<A> aptLast(short b)
	{
		return a -> accept(a, b);
	}
}