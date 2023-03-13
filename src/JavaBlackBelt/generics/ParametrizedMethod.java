package JavaBlackBelt.generics;

import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList list = new ArrayList();
        int i = list.get(0);
        //int i = (Integer)list.get(0);




        list.add(1);
        list.add(2);
        list.add(3);
        int a = GenMethod.getSecondElement(list);
        System.out.println(a);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        String s = GenMethod.getSecondElement(list2);
        System.out.println(s);
    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}