package JavaBlackBelt.collections.list_interface;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("�����");
        arrayList1.add("����");
        arrayList1.add("����");
        arrayList1.add(1, "����");
        for(String s : arrayList1) {
            System.out.print(s + " ");
        }
        System.out.println();

//        ArrayList<Integer> arrayList2 = new ArrayList<>();
//        arrayList2.add(6);
//        for (int i = 0; i < arrayList1.size() ; i++) {
//            System.out.println(arrayList1.get(i));
//        }
        arrayList1.set(1,"����");
        arrayList1.remove(0);
        System.out.println(arrayList1);
    }
}
