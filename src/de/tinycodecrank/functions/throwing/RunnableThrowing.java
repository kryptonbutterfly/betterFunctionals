package de.tinycodecrank.functions.throwing;

@FunctionalInterface
public interface RunnableThrowing<E extends Throwable>
{
	void run() throws E;
	
	/**
	 * @return a Function that accepts an argument and does nothing
	 */
	@SuppressWarnings("unchecked")
	public static <E extends Throwable> RunnableThrowing<E> sink()
	{
		return (RunnableThrowing<E>) SINK;
	}
	
	static final RunnableThrowing<?> SINK = () ->
	{};
}