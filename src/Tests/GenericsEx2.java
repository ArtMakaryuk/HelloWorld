package Tests;

import java.util.*;

public class GenericsEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int count = 1;
        while (sc.hasNextInt()) {
            if (count % 2 == 0) {
                list.add(sc.nextInt());
            }
            else sc.nextInt();
            count++;
        }
        Collections.reverse(list);
        /*String a = list.toString();
        a.replace("1", "2");
*/
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }


    }
}
