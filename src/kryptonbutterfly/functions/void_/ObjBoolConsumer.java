package kryptonbutterfly.functions.void_;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.bool_.BoolConsumer;
import kryptonbutterfly.functions.bool_.applicable.BoolApplicableRight;

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
	
	/**
	 * @return a Function that accepts two arguments and does nothing
	 */
	@SuppressWarnings("unchecked")
	public static <T> ObjBoolConsumer<T> sink()
	{
		return (ObjBoolConsumer<T>) SINK;
	}
	
	static final ObjBoolConsumer<?> SINK = (a, b) ->
	{};
}