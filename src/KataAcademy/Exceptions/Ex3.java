package KataAcademy.Exceptions;

public class Ex3 {
    public static class Car implements AutoCloseable {
        public void drive() {
            System.out.println("Машина поехала");
        }

        @Override
        public void close() throws Exception {
            System.out.println("Машина закрывается");
        }
    }
    public static void main(String... args) {
        try (Car car = new Car()) {
            car.drive();
        } catch (Exception e) {
        }
    }
}
