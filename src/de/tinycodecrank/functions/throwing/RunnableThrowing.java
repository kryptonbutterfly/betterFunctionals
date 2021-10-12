package de.tinycodecrank.functions.throwing;

@FunctionalInterface
public interface RunnableThrowing<E extends Throwable>
{
	void run() throws E;
}