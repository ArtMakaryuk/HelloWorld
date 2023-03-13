package Tests;

import java.util.Scanner;

class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        switch (str) {
            case "System.out.println()":
                System.out.println("Ёто команда вывода на печать");
                break;
            case "if":
                System.out.println("Ёто условный оператор");
                break;
            case "else":
                System.out.println("Ёто альтернативна€ конструкци€ условного оператора");
                break;
            default:
                System.out.println("–аздел в разработке");
        }
    }
}