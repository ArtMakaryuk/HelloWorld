package JavaBlackBelt.collections.list_interface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("AD");
        arrayList1.add("@AA");
        arrayList1.add("sD");
        System.out.println(arrayList1.toString());
//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("xasdS");
//        arrayList2.add("AAASss");
//        arrayList2.add("sD");

//        arrayList1.removeAll(arrayList2);
//        System.out.println(arrayList1);

//        String[] array = arrayList1.toArray(new String[0]);
//        for (String s : array) {
//            System.out.println(s);
//        }
        List<Integer> list1 = List.of(3, 8, 13);
        System.out.println(list1);

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);
    }
    @Override
    public String toString() {
        return "S";
    }

}
