package Tests;

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.close();
        if (x >= y) {
            if (x >= z) {
                if (z >= y) {
                    System.out.println(z);
                } else if (y >= z) {
                    System.out.println(y);
                }
            } else if (x <= z) {
                System.out.println(x);
            }
        } else if (y >= x) {
            if (z >= x) {
                if (z >= y) {
                    System.out.println(y);
                } else if (y >= z) {
                    System.out.println(z);
                }
            } else if (x >= z) {
                System.out.println(x);
            }
        }
    }
}