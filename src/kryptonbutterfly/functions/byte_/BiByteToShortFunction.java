package kryptonbutterfly.functions.byte_;

import kryptonbutterfly.functions.byte_.applicable.ByteApplicableLeft;
import kryptonbutterfly.functions.byte_.applicable.ByteApplicableRight;

@FunctionalInterface
public interface BiByteToShortFunction extends ByteApplicableLeft<ByteToShortFunction>, ByteApplicableRight<ByteToShortFunction>
{
	short apply(byte a, byte b);
	
	@Override
	default ByteToShortFunction aptFirst(byte a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default ByteToShortFunction aptLast(byte b)
	{
		return a -> apply(a, b);
	}
}