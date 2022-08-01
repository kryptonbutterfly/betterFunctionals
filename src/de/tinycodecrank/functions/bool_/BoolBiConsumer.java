package de.tinycodecrank.functions.bool_;

import de.tinycodecrank.functions.bool_.applicable.BoolApplicableLeft;
import de.tinycodecrank.functions.bool_.applicable.BoolApplicableRight;

@FunctionalInterface
public interface BoolBiConsumer extends BoolApplicableLeft<BoolConsumer>, BoolApplicableRight<BoolConsumer>
{
	void accept(boolean a, boolean b);
	
	@Override
	default BoolConsumer aptFirst(boolean a)
	{
		return z -> accept(a, z);
	}
	
	@Override
	default BoolConsumer aptLast(boolean z)
	{
		return a -> accept(a, z);
	}
	
	/**
	 * @return a Function that accepts two arguments and does nothing
	 */
	public static BoolBiConsumer sink()
	{
		return SINK;
	}
	
	static final BoolBiConsumer SINK = (a, b) ->
	{};
}