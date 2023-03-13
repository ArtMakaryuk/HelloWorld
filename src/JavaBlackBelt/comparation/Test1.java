package JavaBlackBelt.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Артур");
        list.add("Эдуард");
        list.add("Иван");
        System.out.println("Перед сортировкой");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("После сортировки");
        System.out.println(list);

    }
}
