package JavaBlackBelt.collections.list_interface;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("ASD");
        arrayList1.add("ZA");
        arrayList1.add("sD");
        arrayList1.add("ggAQw");
        arrayList1.add("vxxx");

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList1);
    }
}
