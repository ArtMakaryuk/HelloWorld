package JavaBlackBelt.collections.list_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("�����");
        arrayList1.add("����");
        arrayList1.add("����");

        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("�����");
        arrayList2.add("����");


        List<String> arrayList3 = new ArrayList<>();

        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println(arrayList4);
        // ��������� �� ������ �������
        System.out.println(arrayList1 == arrayList4);
    }
}
