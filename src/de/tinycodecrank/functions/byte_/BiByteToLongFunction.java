package de.tinycodecrank.functions.byte_;

import de.tinycodecrank.functions.byte_.applicable.ByteApplicableLeft;
import de.tinycodecrank.functions.byte_.applicable.ByteApplicableRight;

@FunctionalInterface
public interface BiByteToLongFunction extends ByteApplicableLeft<ByteToLongFunction>, ByteApplicableRight<ByteToLongFunction>
{
	long apply(byte a, byte b);
	
	@Override
	default ByteToLongFunction aptFirst(byte a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default ByteToLongFunction aptLast(byte b)
	{
		return a -> apply(a, b);
	}
}