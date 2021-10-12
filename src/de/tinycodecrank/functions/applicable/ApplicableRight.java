package de.tinycodecrank.functions.applicable;

@FunctionalInterface
public interface ApplicableRight<T, R>
{
	R aptLast(T t);
}