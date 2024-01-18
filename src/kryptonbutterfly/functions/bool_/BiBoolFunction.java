package kryptonbutterfly.functions.bool_;

import kryptonbutterfly.functions.bool_.applicable.BoolApplicableLeft;
import kryptonbutterfly.functions.bool_.applicable.BoolApplicableRight;

@FunctionalInterface
public interface BiBoolFunction<R> extends BoolApplicableLeft<BoolFunction<R>>, BoolApplicableRight<BoolFunction<R>>
{
	R apply(boolean a, boolean b);
	
	@Override
	default BoolFunction<R> aptFirst(boolean a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default BoolFunction<R> aptLast(boolean b)
	{
		return a -> apply(a, b);
	}
}