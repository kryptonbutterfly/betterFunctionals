package kryptonbutterfly.functions.byte_;

import kryptonbutterfly.functions.byte_.applicable.ByteApplicableLeft;
import kryptonbutterfly.functions.byte_.applicable.ByteApplicableRight;

@FunctionalInterface
public interface ByteBiConsumer extends ByteApplicableLeft<ByteConsumer>, ByteApplicableRight<ByteConsumer>
{
	void accept(byte a, byte b);
	
	@Override
	default ByteConsumer aptFirst(byte a)
	{
		return z -> accept(a, z);
	}
	
	@Override
	default ByteConsumer aptLast(byte z)
	{
		return a -> accept(a, z);
	}
	
	/**
	 * @return a Function that accepts two arguments and does nothing
	 */
	public static ByteBiConsumer sink()
	{
		return SINK;
	}
	
	static final ByteBiConsumer SINK = (a, b) ->
	{};
}