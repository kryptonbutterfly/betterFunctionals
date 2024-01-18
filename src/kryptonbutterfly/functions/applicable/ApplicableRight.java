package kryptonbutterfly.functions.applicable;

@FunctionalInterface
public interface ApplicableRight<T, R>
{
	R aptLast(T t);
}