package kryptonbutterfly.functions.double_;

import java.util.function.DoubleFunction;

import kryptonbutterfly.functions.double_.applicable.DoubleApplicableLeft;
import kryptonbutterfly.functions.double_.applicable.DoubleApplicableRight;

@FunctionalInterface
public interface BiDoubleFunction<R> extends DoubleApplicableLeft<DoubleFunction<R>>, DoubleApplicableRight<DoubleFunction<R>>
{
	R apply(double a, double b);
	
	@Override
	default DoubleFunction<R> aptFirst(double a)
	{
		return b -> apply(a, b);
	}
	
	@Override
	default DoubleFunction<R> aptLast(double b)
	{
		return a -> apply(a, b);
	}
}