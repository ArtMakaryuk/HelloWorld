package KataAcademy.SteamAPI;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex1 {
    public static void main(String[] args) {
        int a = 13;


    }
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> ((n * n) / 10) % 1000);
    }
}


