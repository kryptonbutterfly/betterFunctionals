package kryptonbutterfly.functions.bool_;

import kryptonbutterfly.functions.bool_.applicable.BoolApplicableLeft;
import kryptonbutterfly.functions.bool_.applicable.BoolApplicableRight;

@FunctionalInterface
public interface BiBoolToByteFunction extends BoolApplicableLeft<BoolToByteFunction>, BoolApplicableRight<BoolToByteFunction>
{
	byte accept(boolean a, boolean b);
	
	@Override
	default BoolToByteFunction aptFirst(boolean a)
	{
		return b -> accept(a, b);
	}
	
	@Override
	default BoolToByteFunction aptLast(boolean b)
	{
		return a -> accept(a, b);
	}
}