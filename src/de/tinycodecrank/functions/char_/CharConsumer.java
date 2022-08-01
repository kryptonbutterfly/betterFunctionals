package de.tinycodecrank.functions.char_;

import de.tinycodecrank.functions.char_.applicable.CharApplicableLeft;
import de.tinycodecrank.functions.char_.applicable.CharApplicableRight;

@FunctionalInterface
public interface CharConsumer extends CharApplicableRight<Runnable>, CharApplicableLeft<Runnable>
{
	void accept(char a);
	
	@Override
	default Runnable aptFirst(char a)
	{
		return aptLast(a);
	}
	
	@Override
	default Runnable aptLast(char z)
	{
		return () -> accept(z);
	}
	
	/**
	 * @return a Function that accepts an argument and does nothing
	 */
	public static CharConsumer sink()
	{
		return SINK;
	}
	
	static final CharConsumer SINK = a ->
	{};
}