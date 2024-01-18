package kryptonbutterfly.functions.byte_;

import kryptonbutterfly.functions.byte_.applicable.ByteApplicableLeft;
import kryptonbutterfly.functions.byte_.applicable.ByteApplicableRight;

@FunctionalInterface
public interface BiByteToCharFunction extends ByteApplicableLeft<ByteToCharFunction>, ByteApplicableRight<ByteToCharFunction>
{
	char apply(byte a, byte b);
	
	@Override
	default ByteToCharFunction aptFirst(byte a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default ByteToCharFunction aptLast(byte b)
	{
		return a -> apply(a, b);
	}
}