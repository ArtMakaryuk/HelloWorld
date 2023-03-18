package KataAcademy.basicSyntax.primitiveTypes;

import java.math.BigInteger;

import static java.lang.Long.MAX_VALUE;


public class Ex6 {
    public static void main(String[] args) {
        maxLongSqr();

    }
    public static void maxLongSqr() {
        BigInteger l = BigInteger.valueOf(MAX_VALUE);
        BigInteger ans = l.multiply(l);
        System.out.println(ans);
    }
}
