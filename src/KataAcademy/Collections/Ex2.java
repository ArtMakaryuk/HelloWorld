package KataAcademy.Collections;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(System.in);
//        for (Map.Entry<String, Long> pair : getSalesMap(reader).entrySet()){
//            System.out.println(pair.getKey() + " " + pair.getValue());
//        }
        System.out.println(getSalesMap(reader).toString());
    }
    public static Map<String, Long> getSalesMap(Reader reader) throws IOException {
        Scanner sc = new Scanner(reader);
        int count = 1;
        Map<String, Long> map = new HashMap<>();
        while (sc.hasNext()) {
            map.put(sc.next(), sc.nextLong());
        }
        return map;
    }

}
