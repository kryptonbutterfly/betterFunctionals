package kryptonbutterfly.functions.int_;

import kryptonbutterfly.functions.int_.applicable.IntApplicableLeft;
import kryptonbutterfly.functions.int_.applicable.IntApplicableRight;

@FunctionalInterface
public interface BiIntToFloatFunction extends IntApplicableLeft<IntToFloatFunction>, IntApplicableRight<IntToFloatFunction>
{
	float apply(int a, int b);
	
	@Override
	default IntToFloatFunction aptFirst(int a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default IntToFloatFunction aptLast(int b)
	{
		return a -> apply(a, b);
	}
}