package kryptonbutterfly.functions.int_;

import java.util.function.IntConsumer;

import kryptonbutterfly.functions.int_.applicable.IntApplicableLeft;
import kryptonbutterfly.functions.int_.applicable.IntApplicableRight;

@FunctionalInterface
public interface IntBiConsumer extends IntApplicableRight<IntConsumer>, IntApplicableLeft<IntConsumer>
{
	void apply(int a, int b);
	
	@Override
	default IntConsumer aptLast(int b)
	{
		return a -> apply(a, b);
	}
	
	@Override
	default IntConsumer aptFirst(int a)
	{
		return b -> apply(a, b);
	}
	
	/**
	 * @return a Function that accepts two arguments and does nothing
	 */
	public static IntBiConsumer sink()
	{
		return SINK;
	}
	
	static final IntBiConsumer SINK = (a, b) ->
	{};
}