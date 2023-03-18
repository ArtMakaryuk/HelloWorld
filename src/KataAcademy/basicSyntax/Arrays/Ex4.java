package KataAcademy.basicSyntax.Arrays;

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        int[] numbers = {};
        System.out.println(Arrays.toString(inverseArray(numbers)));
    }
    public static int[] inverseArray(int[] numbers) {
        int[] reverse = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reverse[numbers.length-1-i] = numbers[i];
        }
        return reverse;
    }
}
