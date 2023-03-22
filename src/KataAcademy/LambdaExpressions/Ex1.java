package KataAcademy.LambdaExpressions;

public class Ex1 {
    public static void main(String[] args) {

    }
    @FunctionalInterface
    public interface NumberGenerator<T extends Number> {
        boolean cond(T arg);
    }

    public static NumberGenerator<? super Number> getGenerator() {
        return number -> number.intValue() > 0;
    }
}
