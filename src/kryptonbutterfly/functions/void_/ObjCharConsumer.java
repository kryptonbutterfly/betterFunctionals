package kryptonbutterfly.functions.void_;

import kryptonbutterfly.functions.applicable.ApplicableLeft;
import kryptonbutterfly.functions.char_.CharConsumer;
import kryptonbutterfly.functions.char_.applicable.CharApplicableRight;

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
	
	/**
	 * @return a Function that accepts two arguments and does nothing
	 */
	@SuppressWarnings("unchecked")
	public static <T> ObjCharConsumer<T> sink()
	{
		return (ObjCharConsumer<T>) SINK;
	}
	
	static final ObjCharConsumer<?> SINK = (a, b) ->
	{};
}