package JavaBlackBelt.collections.set_interface;

import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(8);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(3);
        hashSet2.add(5);
        hashSet2.add(8);

        HashSet<Integer> subtract = new HashSet<>(hashSet);
        subtract.removeAll(hashSet2);

        System.out.println(subtract);
    }
}
