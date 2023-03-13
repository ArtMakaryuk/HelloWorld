package Tests;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = 0;
        double sum = 0;
        while (true) {
            int x = sc.nextInt();
                if (x > 0 && x <= 10) {
                    sum += x;
                    n++;
                }
                else {
                    break;
                }
        }
        double dd = (sum / n);
        System.out.println(dd);
    }
}