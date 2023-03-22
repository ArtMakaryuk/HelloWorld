package KataAcademy.basicSyntax.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] numbers = {};
        printArray(numbers);
    }

    public static void printArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
