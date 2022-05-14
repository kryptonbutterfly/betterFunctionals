package de.tinycodecrank.functions.applicable;

public interface ApplicableVarargsRight<T, R>
{
	R aptLast(@SuppressWarnings("unchecked") T... t);
}