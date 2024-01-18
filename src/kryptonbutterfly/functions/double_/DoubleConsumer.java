package kryptonbutterfly.functions.double_;

import kryptonbutterfly.functions.double_.applicable.DoubleApplicableLeft;
import kryptonbutterfly.functions.double_.applicable.DoubleApplicableRight;

@FunctionalInterface
public interface DoubleConsumer extends DoubleApplicableLeft<Runnable>, DoubleApplicableRight<Runnable>
{
	void apply(double a);
	
	@Override
	default Runnable aptFirst(double a)
	{
		return aptLast(a);
	}
	
	@Override
	default Runnable aptLast(double z)
	{
		return () -> apply(z);
	}
	
	/**
	 * @return a Function that accepts an arguments and does nothing
	 */
	public static DoubleConsumer sink()
	{
		return SINK;
	}
	
	static final DoubleConsumer SINK = a ->
	{};
}