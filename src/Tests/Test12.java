package Tests;

import java.util.Scanner;

class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        String str1 = Integer.toString(n);

        for (int i = 1; i <= n; i++) {
            System.out.println(n);
            n++;
            if (n == 6) {
                break;
            }

        }
    }
}