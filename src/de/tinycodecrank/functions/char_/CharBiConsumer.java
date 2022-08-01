package de.tinycodecrank.functions.char_;

import de.tinycodecrank.functions.char_.applicable.CharApplicableLeft;
import de.tinycodecrank.functions.char_.applicable.CharApplicableRight;

@FunctionalInterface
public interface CharBiConsumer extends CharApplicableLeft<CharConsumer>, CharApplicableRight<CharConsumer>
{
	void accept(char a, char b);
	
	@Override
	default CharConsumer aptFirst(char a)
	{
		return z -> accept(a, z);
	}
	
	@Override
	default CharConsumer aptLast(char z)
	{
		return a -> accept(a, z);
	}
	
	/**
	 * @return a Function that accepts two arguments and does nothing
	 */
	public static CharBiConsumer sink()
	{
		return SINK;
	}
	
	static final CharBiConsumer SINK = (a, b) ->
	{};
}