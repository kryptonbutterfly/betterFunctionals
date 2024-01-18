package kryptonbutterfly.functions.byte_;

import kryptonbutterfly.functions.byte_.applicable.ByteApplicableLeft;
import kryptonbutterfly.functions.byte_.applicable.ByteApplicableRight;

@FunctionalInterface
public interface ByteBiPredicate extends ByteApplicableLeft<BytePredicate>, ByteApplicableRight<BytePredicate>
{
	boolean test(byte a, byte b);
	
	@Override
	default BytePredicate aptFirst(byte a)
	{
		return b -> test(a, b);
	}
	
	@Override
	default BytePredicate aptLast(byte b)
	{
		return a -> test(a, b);
	}
}