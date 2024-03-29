package kryptonbutterfly.functions.short_;

import kryptonbutterfly.functions.short_.applicable.ShortApplicableLeft;
import kryptonbutterfly.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface ShortBiConsumer extends ShortApplicableLeft<ShortConsumer>, ShortApplicableRight<ShortConsumer>
{
	void accept(short a, short b);
	
	@Override
	default ShortConsumer aptFirst(short a)
	{
		return z -> accept(a, z);
	}
	
	@Override
	default ShortConsumer aptLast(short z)
	{
		return a -> accept(a, z);
	}
	
	/**
	 * @return a Function that accepts two arguments and does nothing
	 */
	public static ShortBiConsumer sink()
	{
		return SINK;
	}
	
	static final ShortBiConsumer SINK = (a, b) ->
	{};
}