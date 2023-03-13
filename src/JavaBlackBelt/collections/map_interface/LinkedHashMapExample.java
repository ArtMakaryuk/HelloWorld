package JavaBlackBelt.collections.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm =
                new LinkedHashMap<>(16,0.75f,true);
        Student st1 = new Student("Artur","Makaryuk",3);
        Student st2 = new Student("Mariya","Ivanova",1);
        Student st3 = new Student("Sergei","Petrov",4);
        Student st4 = new Student("Igor","Sidorov",2);

        lhm.put(7.2, st3);
        lhm.put(7.5, st4);
        lhm.put(5.8, st1);
        lhm.put(6.4, st2);

        System.out.println(lhm);
        System.out.println(lhm.get(6.4));
        System.out.println(lhm.get(7.5));
        System.out.println(lhm);

    }
}
