package kryptonbutterfly.functions.short_;

import kryptonbutterfly.functions.short_.applicable.ShortApplicableLeft;
import kryptonbutterfly.functions.short_.applicable.ShortApplicableRight;

@FunctionalInterface
public interface ShortConsumer extends ShortApplicableRight<Runnable>, ShortApplicableLeft<Runnable>
{
	void accept(short a);
	
	@Override
	default Runnable aptFirst(short a)
	{
		return aptLast(a);
	}
	
	@Override
	default Runnable aptLast(short z)
	{
		return () -> accept(z);
	}
	
	/**
	 * @return a Function that accepts an argument and does nothing
	 */
	public static ShortConsumer sink()
	{
		return SINK;
	}
	
	static final ShortConsumer SINK = a ->
	{};
}