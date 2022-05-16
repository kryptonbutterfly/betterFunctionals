package de.tinycodecrank.functions.void_;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.float_.FloatConsumer;
import de.tinycodecrank.functions.float_.applicable.FloatApplicableRight;

@FunctionalInterface
public interface ObjFloatConsumer<A> extends ApplicableLeft<A, FloatConsumer>, FloatApplicableRight<Consumer_<A>>
{
	void accept(A a, float b);
	
	@Override
	default FloatConsumer aptFirst(A a)
	{
		return b -> accept(a, b);
	}
	
	@Override
	default Consumer_<A> aptLast(float b)
	{
		return a -> accept(a, b);
	}
}