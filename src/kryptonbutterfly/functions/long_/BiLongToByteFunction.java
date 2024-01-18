package kryptonbutterfly.functions.long_;

import kryptonbutterfly.functions.long_.applicable.LongApplicableLeft;
import kryptonbutterfly.functions.long_.applicable.LongApplicableRight;

@FunctionalInterface
public interface BiLongToByteFunction extends LongApplicableLeft<LongToByteFunction>, LongApplicableRight<LongToByteFunction>
{
	byte apply(long a, long b);
	
	@Override
	default LongToByteFunction aptFirst(long a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default LongToByteFunction aptLast(long b)
	{
		return a -> apply(a, b);
	}
}