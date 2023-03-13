package JavaBlackBelt.collections.list_interface;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student st1 = new Student("Артур", 'm', 30, 5, 9.8);
        Student st2 = new Student("Елена", 'f', 28, 4, 9.9);
        Student st3 = new Student("Валентин", 'm', 22, 2, 5.4);
        Student st4 = new Student("Денис", 'm', 19, 1, 6.3);
        Student st5 = new Student("Чукбек", 'f', 23, 3, 7.1);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        System.out.println(studentList);
        Student st6 = new Student("Чукбек", 'f', 23, 3, 7.1);
        studentList.remove(st6);
        System.out.println(studentList);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student - " +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                age == student.age &&
                course == student.course &&
                Double.compare(student.avgGrade, avgGrade) == 0 &&
                Objects.equals(name, student.name);
    }

}