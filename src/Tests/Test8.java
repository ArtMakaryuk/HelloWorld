package Tests;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while (sc.hasNext()) {
            int x = sc.nextInt();
                System.out.println(x * x + " " + x * x * x + " " + x * x * x * x + " " + x * x * x * x * x);
            n++;
        }
    }
}