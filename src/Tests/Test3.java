package Tests;

import java.util.Scanner;

class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        switch (str) {
            case "System.out.println()":
                System.out.println("��� ������� ������ �� ������");
                break;
            case "if":
                System.out.println("��� �������� ��������");
                break;
            case "else":
                System.out.println("��� �������������� ����������� ��������� ���������");
                break;
            default:
                System.out.println("������ � ����������");
        }
    }
}