package Stream;


import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        String[] names = {"john", "marcus", "elena", "capitonchik"};
        System.out.println(getTotalNumberOfLettersOfNamesLongerThanFive(names));

    }
    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        Stream<String> stream = Stream.of(names);
        return stream.filter(p -> p.length() > 5).mapToInt(String::length).sum();
    }
}
