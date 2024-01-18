package kryptonbutterfly.functions.throwing;

@FunctionalInterface
public interface SupplierThrowing<R, E extends Throwable>
{
	R get() throws E;
}