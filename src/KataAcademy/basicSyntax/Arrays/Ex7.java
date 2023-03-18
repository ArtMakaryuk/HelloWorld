package KataAcademy.basicSyntax.Arrays;

import java.util.Arrays;

public class Ex7 {
    public static void main(String[] args) {
        int[] array1 = {};
        System.out.println(Arrays.toString(getArrayMiddle(array1)));
    }
    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length != 0) {
            if (numbers.length % 2 == 0) {
                int[] as = Arrays.copyOfRange(numbers, numbers.length / 2 - 1, numbers.length / 2 + 1);
                return as;
            } else {
                return Arrays.copyOfRange(numbers, numbers.length / 2, numbers.length / 2 + 1);
            }
        } else {
            return new int[0];
        }
    }
}
