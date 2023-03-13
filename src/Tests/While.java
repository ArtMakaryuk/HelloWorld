package Tests;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int y = 0;
        while (true) {
            int x = sc.nextInt();
            ;
            if (x % 11 == 0) {
                if (x % 3 == 0) {
                    sum += x;
                }
                y++;
                continue;
            }
            if (x % 11 != 0) {
                break;
            }
        }
        System.out.println(y);
        System.out.println(sum);
    }
}
