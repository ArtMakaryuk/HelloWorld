package KataAcademy.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex1 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);

        System.out.println(set1.toString());
        System.out.println(set2.toString());
        System.out.println(symmetricDifference(set1, set2).toString());
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> set3 = new HashSet<>(set1);
        Set<T> set4 = new HashSet<>(set1);
        set3.addAll(set2);
        set4.retainAll(set2);
        set3.removeAll(set4);
        return set3;
    }

}
