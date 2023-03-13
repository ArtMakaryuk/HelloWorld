package Tests;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        int diff = sc.nextInt();
        sc.close();
        int zp1 = Integer.parseInt(str1);
        int zp2 = Integer.parseInt(str2);
        int zp3 = Integer.parseInt(str3);
        int max = Math.max(zp1, Math.max(zp2, zp3));
        int min = Math.min(zp1, Math.min(zp2, zp3));
        if (max - min > diff) {
            System.out.println("Ура, бастуем!");
        } else {
            System.out.println("За работу, Солнце ещё высоко");
        }
    }
}
