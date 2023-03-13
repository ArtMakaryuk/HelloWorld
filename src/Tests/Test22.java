package Tests;

import java.util.Arrays;
import java.lang.StringBuilder;
import java.util.function.DoubleUnaryOperator;

public class Test22 {
    public static void main(String[] args) {
        String[] roles = {
                "����������", "����� ���������",
                "������� ����������",
                "���� �����"};
        String[] textLines = {
                "����������: � ��������� ���, �������, � ���, ����� �������� ��� ������������� ��������: � ��� ���� �������.",
                "����� ���������: ��� �������?",
                "������� ����������: ��� �������?",
                "����������: ������� �� ����������, ���������. � ��� � ��������� ������������.",
                "����� ���������: ��� �� ��!",
                "������� ����������: ��� �� ���� ������, ��� �����!",
                "���� �����: ������� ����! ��� � � ��������� ������������!"};
        String answer = printTextPerRole(roles, textLines);
        System.out.println(answer);
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {

        StringBuilder rolebytext = new StringBuilder();


        int k = 1;
        for (String role : roles) {
            rolebytext.append(role);
            rolebytext.append(":");
            rolebytext.append("\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role + ":")) {
                    rolebytext.append(i + 1);
                    rolebytext.append(")");
                    rolebytext.append(textLines[i].substring(role.length() + 1));
                    rolebytext.append("\n");
                }
            }
            rolebytext.append("\n");
        }

        return rolebytext.toString();
    }


}
