package Tests;

import java.util.*;

public class Jaba {
    public static void main(String[] args) {

        Set<Integer> num1 = new HashSet<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);

        Set<Integer> num2 = new HashSet<>();
        num2.add(0);
        num2.add(1);
        num2.add(2);

        Set<String> str = new HashSet<>();
        str.add("hui");
        Set<String> str2 = new HashSet<>();
        str.add("hui2");

        Set<String> result1 = symmetricDifference(str,str2);

        Set<Integer> result = symmetricDifference(num1,num2);
        System.out.println(result);

    }
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> result = new HashSet<>();
        for(T s1 : set1) {
            if (!set2.contains(s1)){
                result.add(s1);
            }
        } for(T s2 : set2) {
            if (!set1.contains(s2)){
                result.add(s2);
            }
        }
        return result;
    }
}
