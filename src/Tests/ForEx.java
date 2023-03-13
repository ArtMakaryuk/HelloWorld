package Tests;

import java.util.Scanner;

public class ForEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            int count = 1;
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= j; k++) {
                    if (count <= i) {
                        System.out.print(j);
                    }
                    if (count < i) {
                        System.out.print(" ");
                    }
                    count++;
                }

            }
            System.out.println();
        }

    }

}



