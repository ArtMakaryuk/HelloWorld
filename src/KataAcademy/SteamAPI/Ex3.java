package KataAcademy.SteamAPI;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Ex3 {
    public static void main(String[] args) {
        int value = 5;
        System.out.println(factorial(value));

    }
    public static BigInteger factorial(int value) {
        if (value < 2) {
            return BigInteger.valueOf(1);
        } else {
            return IntStream.rangeClosed(2, value).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
        }
    }

}
