import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        };
        BiConsumer<Integer, Integer> minMaxConsumer = new BiConsumer<Integer, Integer>() {
            @Override
            public void accept(Integer integer, Integer integer2) {
                if (integer>integer2) {
                    System.out.println("Min : " + integer2);
                    System.out.println("Max : " + integer);
                }
                else {System.out.println("Min : " + integer);
                System.out.println("Max : " + integer2);}
            }
        };
        Integer[] ints = {13, 16, 25, 62, 384, 745, 502, 200};
        Stream<Integer> stream = Stream.of(13, 16, 25, 62, 384, 745, 502, 200);
//        Comparator<Integer> comparator1 = Comparator.comparingInt(o -> o);
       BiConsumer<Integer, Integer> biConsumer = (t, u) -> System.out.println(t + " " + u);
//        System.out.println(findMinMax(Arrays.stream(ints), comparator, minMaxConsumer));
        System.out.println(findMinMax(stream, comparator, minMaxConsumer));
//        System.out.println(findMinMax(Arrays.stream(ints),comparator,biConsumer));


    }
    public static <T> boolean findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> list = stream.sorted(order).collect(Collectors.toList());
        if(list.isEmpty()) {
            minMaxConsumer.accept(null,null);
        }else {
            minMaxConsumer.accept(list.get(0), list.get(list.size()-1));
        }
       return false;
    }
}
