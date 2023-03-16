import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"UTF-8");
//                .useDelimiter("[^\\p{L}\\p{Digit}]+");
//        List<String> list = new ArrayList<>();
        String str = sc.nextLine();
        String str1 = str.replaceAll("[^a-zA-Zà-ÿÀ-ß0-9']+", " ");
        String[] array = str1.split(" ");
        Arrays.stream(array)
                .map(s -> s.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed().thenComparing(Map.Entry::getKey))
                .map(s->s.getKey())
                .limit(10)
                .forEach(System.out::println);
//        Map<String, Integer> mapa = new HashMap<>();
//        sc.forEachRemaining(s -> mapa.merge(s.toLowerCase(), 1, (a,b)->a+b));
//
//        mapa.entrySet()
//                .stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry::getKey))
//                .map(s -> s.getKey())
//                .limit(10)
//                .forEach(System.out::println);

    }
}
