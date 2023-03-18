package KataAcademy.basicSyntax.Arrays;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int[] numbers = {1,3,5,6,9,11,24};
        int start = 4;
        int end = 10;
        System.out.println(Arrays.toString(getSubArrayBetween(numbers, start, end)));
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int count = 0;
        for (int number : numbers) {
            if (number >= start && number <= end) {
                count++;
            }
        }
        int[] answer = new int[count];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                answer[j] = numbers[i];
                j++;
            }
        }
        return answer;
    }
}
