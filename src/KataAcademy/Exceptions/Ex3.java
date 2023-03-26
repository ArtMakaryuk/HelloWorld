package KataAcademy.Exceptions;

public class Ex3 {
    public static class Car implements AutoCloseable {
        public void drive() {
            System.out.println("������ �������");
        }

        @Override
        public void close() throws Exception {
            System.out.println("������ �����������");
        }
    }
    public static void main(String... args) {
        try (Car car = new Car()) {
            car.drive();
        } catch (Exception e) {
        }
    }
}
