package kryptonbutterfly.functions.int_;

import java.util.Arrays;

import kryptonbutterfly.functions.int_.applicable.IntApplicableLeft;
import kryptonbutterfly.functions.int_.applicable.IntApplicableRight;

@FunctionalInterface
public interface MultiIntConsumer extends IntApplicableLeft<MultiIntConsumer>, IntApplicableRight<MultiIntConsumer>
{
	void accept(int... value);
	
	@Override
	default MultiIntConsumer aptLast(int z)
	{
		return (int... t1) ->
		{
			int[] aT = Arrays.copyOf(t1, t1.length + 1);
			aT[t1.length] = z;
			this.accept(aT);
		};
	}
	
	@Override
	default MultiIntConsumer aptFirst(int a)
	{
		return (int... t2) ->
		{
			int[] at = new int[t2.length + 1];
			System.arraycopy(t2, 0, at, 1, t2.length);
			at[0] = a;
			this.accept(at);
		};
	}
	
	/**
	 * @return a Function that accepts arguments and does nothing
	 */
	public static MultiIntConsumer sink()
	{
		return SINK;
	}
	
	static final MultiIntConsumer SINK = a ->
	{};
}