package KataAcademy.basicSyntax.Strings;

public class Ex6 {
    public static void main(String[] args) {
        String[] roles = {"����������", "����� ���������", "������� ����������", "���� �����"};
        String[] textLines = {"����������: � ��������� ���, �������, � ���, ����� �������� ��� ������������� ��������: � ��� ���� �������.",
                "����� ���������: ��� �������?", "������� ����������: ��� �������?", "����������: ������� �� ����������, ���������. � ��� � ��������� ������������.",
                "����� ���������: ��� �� ��!", "������� ����������: ��� �� ���� ������, ��� �����!", "���� �����: ������� ����! ��� � � ��������� ������������!"};
        System.out.println(printTextPerRole(roles, textLines));
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder roleByText = new StringBuilder();
        int k = 1;
        for (String role : roles) {
            roleByText.append(role)
                    .append(":")
                    .append("\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role + ":")) {
                    roleByText.append(i + 1)
                            .append(")")
                            .append(textLines[i].substring(role.length() + 1))
                            .append("\n");
                }
            }
            roleByText.append("\n");
        }
        return roleByText.toString();
    }
}
