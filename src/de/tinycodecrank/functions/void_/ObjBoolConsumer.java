package de.tinycodecrank.functions.void_;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.bool_.BoolConsumer;
import de.tinycodecrank.functions.bool_.applicable.BoolApplicableRight;

@FunctionalInterface
public interface ObjBoolConsumer<A> extends ApplicableLeft<A, BoolConsumer>, BoolApplicableRight<Consumer_<A>>
{
	void accept(A a, boolean b);
	
	@Override
	default BoolConsumer aptFirst(A a)
	{
		return b -> accept(a, b);
	}
	
	@Override
	default Consumer_<A> aptLast(boolean b)
	{
		return a -> accept(a, b);
	}
}