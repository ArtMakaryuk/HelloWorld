package Tests;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= j; i++) {
                if (i == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(" " + i);
                }
            }
            System.out.println();
        }
    }
}