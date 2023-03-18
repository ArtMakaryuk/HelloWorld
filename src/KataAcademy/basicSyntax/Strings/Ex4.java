package KataAcademy.basicSyntax.Strings;

public class Ex4 {
    public static void main(String[] args) {
        String num = "5";
        System.out.println(parseAndSqrt(num));
    }
    public static long parseAndSqrt(String number) {
        long l = Long.parseLong(number);
        double d = Math.sqrt(l);
        return Math.round(d);
    }

}
