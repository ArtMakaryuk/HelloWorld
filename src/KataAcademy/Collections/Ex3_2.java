package KataAcademy.Collections;

import java.util.*;

public class Ex3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int count = 1;
        while (sc.hasNextInt()) {
            int b = sc.nextInt();
            if (count % 2 == 0) {
                deque.addFirst(b);
            }
            count++;
        }
        deque.forEach(s -> System.out.print(s + " "));
    }
}
