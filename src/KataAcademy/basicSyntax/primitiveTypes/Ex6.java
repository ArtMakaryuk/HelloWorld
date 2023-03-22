package KataAcademy.basicSyntax.primitiveTypes;

import java.math.BigInteger;

import static java.lang.Long.MAX_VALUE;


public class Ex6 {
    public static void main(String[] args) {
        maxLongSqr();

    }
    public static void maxLongSqr() {
        System.out.println(BigInteger.valueOf(Long.MAX_VALUE).pow(1));
    }
}
