package de.tinycodecrank.functions.byte_;

import de.tinycodecrank.functions.byte_.applicable.ByteApplicableLeft;
import de.tinycodecrank.functions.byte_.applicable.ByteApplicableRight;

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
}