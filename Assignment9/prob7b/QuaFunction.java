package Assignment9.prob7b;

@FunctionalInterface
public interface QuaFunction<T,U,V,W,R> {
    R apply(T t, U u, V v, W w);
}
