package JavaBlackBelt.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);
        List<Student> students = new ArrayList<>(); // zdes doljen bit List
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        List<Integer> courses = students.stream()
//                .mapToInt(el->el.getCourse())
//                .boxed()
//                .collect(Collectors.toList());
//        System.out.println(courses);

        int sum = students.stream().mapToInt(e -> e.getCourse()).sum();
//        System.out.println(sum);

        double sum2 = students.stream()
                .mapToInt(e -> e.getCourse())
                .average()
                .getAsDouble();
//        System.out.println(sum2);

        int min = students.stream()
                .mapToInt(e -> e.getCourse())
                .min()
                .getAsInt();
//        System.out.println(min);

        int max = students.stream()
                .mapToInt(e -> e.getCourse())
                .max()
                .getAsInt();
//        System.out.println(max);


//        Student min = students.stream().min((x,y) -> x.getAge()-y.getAge()).get();
//        System.out.println(min);
//        Student max = students.stream().max((x,y) -> x.getAge()-y.getAge()).get();
//        System.out.println(max);
//        students.stream().filter(e -> e.getAge() > 20).forEach(System.out::println);
//        System.out.println("-------------------------------------------------");
//        students.stream().filter(e -> e.getAge() > 20).limit(2)
//                .forEach(System.out::println);
//        System.out.println("-------------------------------------------------");
//        students.stream().filter(e -> e.getAge() > 20).skip(2)
//                .forEach(System.out::println);
    }
}
