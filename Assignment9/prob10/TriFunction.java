package Assignment9.prob10;

@FunctionalInterface
public interface TriFunction<T,U, V,R> {
    public R apply(T t, U u, V v);
}
