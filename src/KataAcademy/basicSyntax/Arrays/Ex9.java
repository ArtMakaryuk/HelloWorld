package KataAcademy.basicSyntax.Arrays;

public class Ex9 {
    public static void main(String[] args) {
        int[] nums = {3, 5, 20, 8, 7, 3, 100, 100, 100};
        printOddNumbers(nums);
    }

    public static void printOddNumbers(int[] arr) {
        int q = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) % 2 != 0) {
                if (q != 0) {
                    System.out.print(", ");
                }
                System.out.print(arr[i]);
                q = 1;
            }
        }
        System.out.println();
    }
}

