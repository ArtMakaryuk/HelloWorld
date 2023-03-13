package JavaBlackBelt.generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
//        List<Number> list = new ArrayList<Integer>();
//        List<Object> list = new ArrayList<Integer>();
        List<?> list = new ArrayList<String>();
//        list.add("Hello");

        //bounded wildcard
        List<? extends Number> list30 = new ArrayList<Integer>();

        List<? super Number> list12 = new ArrayList<Object>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Privet");
        list2.add("Poka");
        list2.add("da");
        showListInfo(list2);

        ArrayList<Double> list123 = new ArrayList<>();
        list123.add(3.14);
        list123.add(3.15);
        list123.add(3.16);
        System.out.println(summ(list123));

        ArrayList<Integer> list11 = new ArrayList<>();
        list11.add(3);
        list11.add(30);
        list11.add(35);
        System.out.println(summ(list11));

//        ArrayList<String> stringal = new ArrayList<>();
//        System.out.println(summ(stringal));
    }
    static void showListInfo(List<?> list) {
        System.out.println("My list contains this elements: " + list);
    }

    public static double summ(ArrayList<? extends Number> al) {
        double sum = 0;
        for(Number n : al) {
             sum+=n.doubleValue();
        }
        return sum;
    }
}
