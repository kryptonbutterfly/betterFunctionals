package de.tinycodecrank.functions.byte_;

import de.tinycodecrank.functions.byte_.applicable.ByteApplicableLeft;
import de.tinycodecrank.functions.byte_.applicable.ByteApplicableRight;

@FunctionalInterface
public interface BiByteToIntFunction extends ByteApplicableLeft<ByteToIntFunction>, ByteApplicableRight<ByteToIntFunction>
{
	int apply(byte a, byte b);
	
	@Override
	default ByteToIntFunction aptFirst(byte a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default ByteToIntFunction aptLast(byte b)
	{
		return a -> apply(a, b);
	}
}