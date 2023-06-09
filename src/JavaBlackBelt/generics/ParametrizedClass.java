package JavaBlackBelt.generics;

public class ParametrizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("Privet");
//        System.out.println(info1);
//        String s = info1.getValue();

        Info<Integer> info2 = new Info<>(123);
        System.out.println(info2);
        Integer i1 = info2.getValue();

        Info<Double> info4 = new Info<>(123.12);
        System.out.println(info4);
        Double d1 = info4.getValue();

//        Info<Bus> info3 = new Info<>(new Bus());
//        System.out.println(info3);
//        Bus b1 = info3.getValue();
    }
//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
    //abc(Info info)
}

class Info <T extends Number>{
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }
    public T getValue() {
        return value;
    }
}

interface I1{}
interface I2{}

//class Parent {
//    public void abc(Info<String> info) {
//        String s = info.getValue();
//   }
//}

//class Child extends Parent {
//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
//}
class Bus {

}