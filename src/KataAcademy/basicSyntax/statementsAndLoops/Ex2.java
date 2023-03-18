package KataAcademy.basicSyntax.statementsAndLoops;

import java.math.BigInteger;

public class Ex2 {
    public static void main(String[] args) {
        int val = 12;
        System.out.println(factorial(12));
    }
    public static BigInteger factorial(int value) {
        if (value <= 1) {
            return BigInteger.valueOf(1);
        } else {
            return BigInteger.valueOf(value).multiply(factorial(value - 1));
        }
    }
}
