package KataAcademy.Generics;

import java.util.Objects;

public class Ex2 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(null, "hello");
        System.out.println(pair.getFirst()); // 1
        System.out.println(pair.getSecond()); // "hello"
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        System.out.println(pair.equals(pair2)); // true!
        System.out.println(pair.hashCode() == pair2.hashCode()); // true!
    }

    public static class Pair<T, V> {
        private final T first;
        private final V second;

        public Pair(T first, V second) {
            this.first = first;
            this.second = second;
        }


        public T getFirst() {
            return first;
        }

        public V getSecond() {
            return second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }

        public static <T, V> Pair<T, V> of(T value, V value2) {
            return new Pair<>(value, value2);
        }
    }
}
