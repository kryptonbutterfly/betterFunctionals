package de.tinycodecrank.functions.float_;

import de.tinycodecrank.functions.float_.applicable.FloatApplicableLeft;
import de.tinycodecrank.functions.float_.applicable.FloatApplicableRight;

@FunctionalInterface
public interface FloatBiConsumer extends FloatApplicableLeft<FloatConsumer>, FloatApplicableRight<FloatConsumer>
{
	void accept(float a, float b);
	
	@Override
	default FloatConsumer aptFirst(float a)
	{
		return z -> accept(a, z);
	}
	
	@Override
	default FloatConsumer aptLast(float z)
	{
		return a -> accept(a, z);
	}
	
	/**
	 * @return a Function that accepts two arguments and does nothing
	 */
	public static FloatBiConsumer sink()
	{
		return SINK;
	}
	
	static final FloatBiConsumer SINK = (a, b) ->
	{};
}