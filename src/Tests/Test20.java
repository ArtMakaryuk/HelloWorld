package Tests;

import java.math.BigInteger;

public class Test20 {
    public static void main(String[] args) {
        int value = 4;
        System.out.println(factorial(value));
    }

    public static BigInteger factorial(int value) {
        BigInteger x = new BigInteger(String.valueOf(value));
        BigInteger y = null;
        BigInteger mult = x;
        for (int i = value-1; i > 0; i--) {
            y = BigInteger.valueOf(i);
            mult = y.multiply(mult);
        }
        return mult;
    }
}