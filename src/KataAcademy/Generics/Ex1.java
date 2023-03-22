package KataAcademy.Generics;

public class Ex1 {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        Box.getBox();
    }
    public static class Box<T> {

        private T object;

        public static <T> Box<T> getBox() {
            return new Box<T>();
        }
    }
}
