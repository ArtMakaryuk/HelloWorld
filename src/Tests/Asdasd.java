package Tests;

import java.util.Scanner;

class Asdasd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        sc.close();
        int x = str1.charAt(0);
        int y = str2.charAt(0);
        int z = str3.charAt(0);
        if (((z - x) > 0) && ((z - y) > 0) && ((y - x) > 0)) {
            System.out.println(str1);
            System.out.println(str2);
            System.out.println(str3);
        } else if (((z - x) > 0) && ((y - x) > 0) && ((y - z) > 0)) {
            System.out.println(str1);
            System.out.println(str3);
            System.out.println(str2);
        } else if (((z - y) > 0) && ((x - y) > 0) && ((z - x) > 0)) {
            System.out.println(str2);
            System.out.println(str1);
            System.out.println(str3);
        } else if (((z - y) > 0) && ((x - y) > 0) && ((x - z) > 0)) {
            System.out.println(str2);
            System.out.println(str3);
            System.out.println(str1);
        } else if (((x - z) > 0) && ((y - z) > 0) && ((y - x) > 0)) {
            System.out.println(str3);
            System.out.println(str1);
            System.out.println(str2);
        } else if (((x - z) > 0) && ((y - z) > 0) && ((x - y) > 0)) {
            System.out.println(str3);
            System.out.println(str2);
            System.out.println(str1);
        }
    }
}
