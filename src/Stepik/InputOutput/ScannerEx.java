package Stepik.InputOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        while (sc.hasNext()) {
            try {
                sum+=sc.nextDouble();
            }
            catch (InputMismatchException e) {
                sc.next();
            }
        }
        System.out.printf("%.6f", sum);
    }
}