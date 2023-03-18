package KataAcademy.basicSyntax.primitiveTypes;

public class Ex3 {
    public static void main(String[] args) {
        double price = 9.5;
        int count = 3;
        System.out.println(priceCalculation(price, count));
    }
    public static double priceCalculation(double price, int count) {
        return  price * count;
    }
}
