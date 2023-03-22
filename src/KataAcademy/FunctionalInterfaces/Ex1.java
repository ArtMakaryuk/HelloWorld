package KataAcademy.FunctionalInterfaces;

import java.util.function.UnaryOperator;

public class Ex1 {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(sqrt());
    }
    public static UnaryOperator<Integer> sqrt() {
        return x -> x * x;
    }

}
