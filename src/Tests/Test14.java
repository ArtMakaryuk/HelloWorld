package Tests;

import java.util.Scanner;

class Test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n/2];
        for (int i = 0; i < n/2; i++) {
            int x = 2;
            if (i==0) {
                arr[i] = x+i;
            } else {
                arr[i] = x*i+2;
           }
            x += 2;
            System.out.print(" " + arr[i]);
            sum += arr[i];
        }
        System.out.println();
        System.out.println(sum);
    }
}