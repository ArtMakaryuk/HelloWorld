package KataAcademy.basicSyntax.statementsAndLoops;

import java.math.BigInteger;

public class Ex1 {
    public static void main(String[] args) {
        int val = 5;
        System.out.println(factorial(val));
    }
    public static BigInteger factorial(int value) {
        BigInteger a = BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++) {
            a = a.multiply(BigInteger.valueOf(i));
        }
        return a;
    }
}

