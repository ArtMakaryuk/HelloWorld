package JavaBlackBelt.collections.set_interface;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Artur",3);
        Student st2 = new Student("Elena",5);
        Student st3 = new Student("Igor",1);
        Student st4 = new Student("Vasya",2);
        Student st5 = new Student("Misha",4);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.println(treeSet);
        Student st6 = new Student("Oleg",2);
        Student st7 = new Student("Ivan",4);
        System.out.println(treeSet.subSet(st6, st7));
        System.out.println(st4.equals(st6));
        System.out.println(st4.hashCode()==st6.hashCode());

    }
}
class Student implements Comparable<Student>{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", course=").append(course);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Student o) {
        return this.course-o.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}