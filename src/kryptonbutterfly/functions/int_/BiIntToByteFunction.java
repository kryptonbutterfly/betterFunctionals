package kryptonbutterfly.functions.int_;

import kryptonbutterfly.functions.int_.applicable.IntApplicableLeft;
import kryptonbutterfly.functions.int_.applicable.IntApplicableRight;

@FunctionalInterface
public interface BiIntToByteFunction extends IntApplicableLeft<IntToByteFunction>, IntApplicableRight<IntToByteFunction>
{
	byte apply(int a, int b);
	
	@Override
	default IntToByteFunction aptFirst(int a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default IntToByteFunction aptLast(int b)
	{
		return a -> apply(a, b);
	}
}