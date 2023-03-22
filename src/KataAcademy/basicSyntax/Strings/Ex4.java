package KataAcademy.basicSyntax.Strings;

public class Ex4 {
    public static void main(String[] args) {
        String num = "5";
        System.out.println(parseAndSqrt(num));
    }
    public static long parseAndSqrt(String number) {
        return Math.round(Math.sqrt(Long.parseLong(number)));
    }

}
