package Tests;

import java.util.Scanner;
import java.util.Arrays;

class Test18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        int[] values = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            values[i] = Integer.parseInt(words[i]);
        }
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
    }
}