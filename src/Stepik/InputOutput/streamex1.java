package Stepik.InputOutput;

import java.util.stream.IntStream;

public class streamex1 {
    public static void main(String[] args) {
        pseudoRandomStream(13).limit(15).forEach(System.out::println);
    }
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> ((n * n) / 10) % 1000);
    }
}
