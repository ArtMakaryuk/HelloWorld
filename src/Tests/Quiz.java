package Tests;

import java.util.Scanner;

 class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        if ((d >= 1 && d <= 31) && (m >= 1 && m <= 12) && y >= 0) {
            if (d <= 29 && m == 2 && (y % 400 == 0 || y % 4 == 0 && y % 100 != 0)) {
                System.out.println("true");
            } else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12 && (d >= 1 && d <= 31)) {
                System.out.println("true");
            } else if ((m == 4 || m == 6 || m == 9 || m == 11) && (d >= 1 && d <= 30)) {
                System.out.println("true");
            } else if (d >= 28 && m == 2 && (y % 4 != 0 || (y % 100 == 0 && y % 400 != 0))) {
                System.out.println("true");
            } else System.out.println("false");
        } else {
            System.out.println("false");
        }
    }
}
