import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,3,5,7,9);
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
                    System.out.println("Max : " + integer);
                    System.out.println("Min : " + integer2);
                }
                else {System.out.println("Max : " + integer2);
                System.out.println("Min : " + integer);}
            }
        };
        System.out.println(stream.findFirst().get());

    }
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        stream.
    }
}
