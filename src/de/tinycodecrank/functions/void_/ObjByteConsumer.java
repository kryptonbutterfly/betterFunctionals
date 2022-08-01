package de.tinycodecrank.functions.void_;

import de.tinycodecrank.functions.applicable.ApplicableLeft;
import de.tinycodecrank.functions.byte_.ByteConsumer;
import de.tinycodecrank.functions.byte_.applicable.ByteApplicableRight;

@FunctionalInterface
public interface ObjByteConsumer<A> extends ApplicableLeft<A, ByteConsumer>, ByteApplicableRight<Consumer_<A>>
{
	void accept(A a, byte b);
	
	@Override
	default ByteConsumer aptFirst(A a)
	{
		return b -> accept(a, b);
	}
	
	@Override
	default Consumer_<A> aptLast(byte b)
	{
		return a -> accept(a, b);
	}
	
	/**
	 * @return a Function that accepts two arguments and does nothing
	 */
	@SuppressWarnings("unchecked")
	public static <T> ObjByteConsumer<T> sink()
	{
		return (ObjByteConsumer<T>) SINK;
	}
	
	static final ObjByteConsumer<?> SINK = (a, b) ->
	{};
}