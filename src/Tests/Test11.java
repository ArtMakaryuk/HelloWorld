package Tests;

import java.util.Scanner;

class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = 0;
        int m = 0;
        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <= i; j++) {
                n++;
                if (n > x) {
                    break;
                }
                System.out.print(i + " ");
            }

        }


    }
}

