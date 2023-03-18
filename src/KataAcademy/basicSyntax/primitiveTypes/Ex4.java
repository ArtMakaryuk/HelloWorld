package KataAcademy.basicSyntax.primitiveTypes;

public class Ex4 {
    public static void main(String[] args) {
        double a = 0.00000012312312312312312312312312312301;
        double b = 2.88888823414312333333123123234532455676789474352345567799854365548765463456547769878974563456568776807896123123123123123123455464576574556234243658776967856756867812312312312312312324;
        double c = a + b;
        System.out.println(doubleExpression(a, b, c));

    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) < 0.0001;

    }
}
