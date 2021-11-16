package de.tinycodecrank.functions.byte_;

import de.tinycodecrank.functions.byte_.applicable.ByteApplicableLeft;
import de.tinycodecrank.functions.byte_.applicable.ByteApplicableRight;

@FunctionalInterface
public interface BiByteToFloatFunction extends ByteApplicableLeft<ByteToFloatFunction>, ByteApplicableRight<ByteToFloatFunction>
{
	float apply(byte a, byte b);

	@Override
	default ByteToFloatFunction aptFirst(byte a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default ByteToFloatFunction aptLast(byte b)
	{
		return a -> apply(a, b);
	}
}