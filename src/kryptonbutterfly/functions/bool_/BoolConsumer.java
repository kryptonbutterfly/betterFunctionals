package kryptonbutterfly.functions.bool_;

import kryptonbutterfly.functions.bool_.applicable.BoolApplicableLeft;
import kryptonbutterfly.functions.bool_.applicable.BoolApplicableRight;

@FunctionalInterface
public interface BoolConsumer extends BoolApplicableRight<Runnable>, BoolApplicableLeft<Runnable>
{
	void accept(boolean bool);
	
	@Override
	default Runnable aptFirst(boolean bool)
	{
		return aptLast(bool);
	}
	
	@Override
	default Runnable aptLast(boolean bool)
	{
		return () -> accept(bool);
	}
	
	/**
	 * @return a Function that accepts an argument and does nothing
	 */
	public static BoolConsumer sink()
	{
		return SINK;
	}
	
	static final BoolConsumer SINK = a ->
	{};
}