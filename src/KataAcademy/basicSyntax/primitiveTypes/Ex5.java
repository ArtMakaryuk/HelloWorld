package KataAcademy.basicSyntax.primitiveTypes;

public class Ex5 {
    public static void main(String[] args) {
        double area = 123;
        calcCircleRadius(area);
    }
    public static void calcCircleRadius(double area) {
        System.out.printf("%.2f", Math.sqrt(area / Math.PI));
    }
}
