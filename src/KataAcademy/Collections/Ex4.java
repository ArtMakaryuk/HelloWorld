package KataAcademy.Collections;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Reader reader = new InputStreamReader(System.in);
        for (Map.Entry<String, Long> pair : getSalesMap(reader).entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> map = new HashMap<>();
        Scanner sc = new Scanner(reader);
        while (sc.hasNext()) {
            map.merge(sc.next(), sc.nextLong(), (aLong, aLong2) -> aLong + aLong2);
        }
        return map;
    }
}
