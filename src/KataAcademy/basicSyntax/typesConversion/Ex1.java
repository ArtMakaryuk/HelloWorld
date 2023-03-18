package KataAcademy.basicSyntax.typesConversion;

public class Ex1 {
    public static void main(String[] args) {
        int a = 123;
        char w = charExpression(a);
        System.out.println(w);
    }
    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }
}
