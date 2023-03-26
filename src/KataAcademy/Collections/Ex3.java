package KataAcademy.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int count = 1;
        while (sc.hasNextInt()) {
            int b = sc.nextInt();
            if (count % 2 == 0) {
                list.add(b);
            }
            count++;
        }
        Collections.reverse(list);
        list.forEach(s -> System.out.print(s + " "));
    }
}
