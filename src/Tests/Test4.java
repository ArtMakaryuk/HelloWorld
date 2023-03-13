package Tests;

import java.util.Scanner;

class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        String s = Long.toString(x);
        int y = s.length();
        while (y > 0) {
            System.out.print(s.charAt(y-1));
            y--;
        }
    }
}