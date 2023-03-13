package JavaBlackBelt.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("String");
//        list.add(123);
//        list.add(new StringBuilder("Sdasd"));
//        list.add(new Car());
        list.add("Привет");
        list.add("Пока");
        list.add("Да");
        list.add("Нет");
//        list.add((new Car());

        for(Object o : list) {
            System.out.println(o + " длина " + ((String)o).length());
        }
    }
}
class Car{}