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
        list.add("������");
        list.add("����");
        list.add("��");
        list.add("���");
//        list.add((new Car());

        for(Object o : list) {
            System.out.println(o + " ����� " + ((String)o).length());
        }
    }
}
class Car{}