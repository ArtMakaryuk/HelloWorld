package KataAcademy.oopAndPackages.ClasssAndObject;

public class Ex1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.catchCat(cat, dog);
    }
    public static class Cat {
        public void sayHello() {
            System.out.println("ћ€у!");
        }
    }
    public static class Dog {
        public void sayHello() {
            System.out.println("√ав!");
        }
        public void catchCat(Cat cat, Dog dog) {
            System.out.println(" ошка поймана");
            sayHello();
            cat.sayHello();
        }
    }
}
