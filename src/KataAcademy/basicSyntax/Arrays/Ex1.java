package KataAcademy.basicSyntax.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] numbers = {};
        printArray(numbers);
    }
    public static void printArray(int[] numbers) {
        if (numbers.length == 0) {
            System.out.println("[]");
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers.length == 1) {
                    System.out.println("[" + numbers[i] + "]");
                } else {
                    if (i == 0) {
                        System.out.print("[" + numbers[i] + ", ");
                    } else if (i > 0 && i < numbers.length - 1) {
                        System.out.print(numbers[i] + ", ");
                    } else {
                        System.out.println(numbers[i] + "]");
                    }
                }
            }
        }
    }
}
