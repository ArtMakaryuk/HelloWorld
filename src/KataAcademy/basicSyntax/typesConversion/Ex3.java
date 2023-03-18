package KataAcademy.basicSyntax.typesConversion;

public class Ex3 {
    public static void main(String[] args) {
        int a = -2;
        System.out.println(isPowerOfTwo(a));

    }
    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }


}
