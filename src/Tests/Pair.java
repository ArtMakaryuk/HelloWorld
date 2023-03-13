package Tests;

import java.util.Objects;
public class Pair<T, S> {
    private final T first;
    private final S second;

    private Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> generics = (Pair<?, ?>) o;
        return Objects.equals(first, generics.first) && Objects.equals(second, generics.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
    public static <T, S> Pair<T, S> of(T first, S second) {
        return new Pair<>(first, second);
    }
}
