package KataAcademy.oopAndPackages.Polymorphism;

public class Ex1 {
    public static void main(String[] args) {
        LazyStudent ls = new LazyStudent();
        ls.study();
    }
    public static class Student {
        protected final String studying;
        protected Student(String work) {
            this.studying = work;
        }
        public Student() {
            this.studying = "Прохожу тестовое задание.";
        }
        public void study() {
            System.out.println("Я очень занят. " + studying);
        }
    }
    public static class JavaStudent extends Student {

        public JavaStudent() {
            super("Прохожу курс по Java");
        }
    }
    public static class LazyStudent extends Student {
        public LazyStudent() {

        }
        @Override
        public void study() {
            System.out.println("Сегодня не учусь, мне лень.");
        }
    }
}
