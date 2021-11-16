package de.tinycodecrank.functions.byte_;

import de.tinycodecrank.functions.byte_.applicable.ByteApplicableLeft;
import de.tinycodecrank.functions.byte_.applicable.ByteApplicableRight;

@FunctionalInterface
public interface BiByteToDoubleFunction extends ByteApplicableLeft<ByteToDoubleFunction>, ByteApplicableRight<ByteToDoubleFunction>
{
	double apply(byte a, byte b);
	
	@Override
	default ByteToDoubleFunction aptFirst(byte a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default ByteToDoubleFunction aptLast(byte b)
	{
		return a -> apply(a, b);
	}
}