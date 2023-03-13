package JavaBlackBelt.collections.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000,"Artur Makaryuk");
        map1.put(3211,"Elena Makaryuk");
        map1.put(5464,"Ivan Ivanov");
        map1.put(564,"Nikolay Petrov");
        map1.put(12334,"Nikolay Petrov");
        map1.putIfAbsent(1000,"Oleg Ivanov");
//        map1.put(null,"Sergey Petrov");
//        map1.put(1231233, null);
        System.out.println(map1);
//        System.out.println(map1.get(213));
        map1.remove(5464);
//        System.out.println(map1);
//        System.out.println(map1.containsValue("Artur Makaryuk"));
//        System.out.println(map1.containsKey(1000));
//        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}
