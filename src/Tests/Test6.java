package Tests;

import java.util.Scanner;

class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean a = true;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i != 0) {
                System.out.print(i + " ");
                a = false;
            }
        }
        if (a) {
            System.out.print("Таких чисел нет");
        }
    }
}