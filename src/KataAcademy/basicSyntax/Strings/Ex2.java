package KataAcademy.basicSyntax.Strings;

public class Ex2 {
    public static void main(String[] args) {
        String str = "1234";
        parseAndPrintNumber(str);
    }
    public static void parseAndPrintNumber(String str) {
        System.out.println(Integer.parseInt(str) / 2);
    }
}
