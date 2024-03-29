package kryptonbutterfly.functions.int_;

import kryptonbutterfly.functions.int_.applicable.IntApplicableLeft;
import kryptonbutterfly.functions.int_.applicable.IntApplicableRight;

@FunctionalInterface
public interface IntTriConsumer extends IntApplicableRight<IntBiConsumer>, IntApplicableLeft<IntBiConsumer>
{
	void apply(int a, int b, int c);
	
	@Override
	default IntBiConsumer aptFirst(int a)
	{
		return (int b, int c) -> apply(a, b, c);
	}
	
	@Override
	default IntBiConsumer aptLast(int c)
	{
		return (int a, int b) -> apply(a, b, c);
	}
	
	/**
	 * @return a Function that accepts three arguments and does nothing
	 */
	public static IntTriConsumer sink()
	{
		return SINK;
	}
	
	static final IntTriConsumer SINK = (a, b, c) ->
	{};
}