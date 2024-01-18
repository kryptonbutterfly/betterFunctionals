package kryptonbutterfly.functions.applicable;

@FunctionalInterface
public interface ApplicableLeft<T, R>
{
	R aptFirst(T t);
}