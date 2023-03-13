package JavaBlackBelt.collections.list_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Артур");
        arrayList1.add("Заур");
        arrayList1.add("Иван");

        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Артур");
        arrayList2.add("Иван");


        List<String> arrayList3 = new ArrayList<>();

        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println(arrayList4);
        // Ссылаются на разные объекты
        System.out.println(arrayList1 == arrayList4);
    }
}
