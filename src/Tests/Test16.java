package Tests;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] numbers = str.split(",");
        for (String qq: numbers) {
            System.out.println(qq);
        }
    }
}
