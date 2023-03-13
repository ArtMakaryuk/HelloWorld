package JavaBlackBelt.collections.list_interface;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("ASD");
        arrayList1.add("ZA");
        arrayList1.add("sD");
        System.out.println(arrayList1);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");
        arrayList1.addAll(1,arrayList2);
        System.out.println(arrayList1);

    }
}
