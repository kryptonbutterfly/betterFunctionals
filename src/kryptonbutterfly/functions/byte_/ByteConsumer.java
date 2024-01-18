package kryptonbutterfly.functions.byte_;

import kryptonbutterfly.functions.byte_.applicable.ByteApplicableLeft;
import kryptonbutterfly.functions.byte_.applicable.ByteApplicableRight;

@FunctionalInterface
public interface ByteConsumer extends ByteApplicableLeft<Runnable>, ByteApplicableRight<Runnable>
{
	void apply(byte a);
	
	@Override
	default Runnable aptFirst(byte a)
	{
		return aptLast(a);
	}
	
	@Override
	default Runnable aptLast(byte z)
	{
		return () -> apply(z);
	}
	
	/**
	 * @return a Function that accepts an argument and does nothing
	 */
	public static ByteConsumer sink()
	{
		return SINK;
	}
	
	static final ByteConsumer SINK = a ->
	{};
}