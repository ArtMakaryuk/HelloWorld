package JavaBlackBelt.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentInfo {

    //    void testStudents(ArrayList<Student> al, StudentChecks sc){
//        for(Student s : al) {
//            if(sc.check(s)){
//                System.out.println(s);
//            }
//        }
//    }
    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }

//    void printStudentsOverGrade(ArrayList<Student> arrayList, double grade){
//        for(Student s : arrayList) {
//            if(s.avgGrade>grade){
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentsUnderAge(ArrayList<Student> arrayList, int age){
//        for(Student s : arrayList) {
//            if(s.age>age){
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentsMixCondition(ArrayList<Student> arrayList, int age, double grade, char sex){
//        for(Student s : arrayList) {
//            if(s.avgGrade<grade && s.age>age && s.sex==sex){
//                System.out.println(s);
//            }
//        }
//    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.course-o2.course;
//            }
//        });
//        Collections.sort(students, (student1, student2)
//                -> student1.course-student2.course);
//        System.out.println(students);
//        int s = 3;
//        info.testStudents(students, new CheckOverGrade());

        System.out.println("-------------------------");

//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age<30;
//            }
//        });

//        info.testStudents(students, (Student s) -> {
//            return s.avgGrade>8;
//        });
//
//        System.out.println("-------------------------");
//
//        info.testStudents(students, s -> s.avgGrade>8);
//
//      ��������� ������-��������� � ����������
//        StudentChecks sc = s -> {return s.avgGrade>8;};
//        info.testStudents(students,sc);

//        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
//        Predicate<Student> p2 = student -> student.sex == 'm';
//
//        info.testStudents(students,p1.negate());
//        System.out.println("-------------------------");
//        info.testStudents(students,p1.and(p2));
//        System.out.println("-------------------------");
//        info.testStudents(students,p1.or(p2));

//        System.out.println("-------------------------");
//        info.testStudents(students, (Student s) -> {
//            return s.age<30;
//        });
////
//        System.out.println("-------------------------");
//
//        info.testStudents(students, (Student s) -> {
//            return s.age>20&&s.avgGrade<9.3&&s.sex=='f';
//        });

//        info.printStudentsOverGrade(students,8);
//        System.out.println("-------------------------");
//        info.printStudentsUnderAge(students,30);
//        System.out.println("-------------------------");
//        info.printStudentsMixCondition(students, 20, 9.5, 'f');

        Function<Student, Double> f = student -> student.avgGrade;
        double res = avgOfSmth(students, student -> student.avgGrade);
        System.out.println(res);
        double res2 = avgOfSmth(students, student -> (double)student.course);
        System.out.println(res2);
        double res3 = avgOfSmth(students, student -> (double)student.age);
        System.out.println(res3);
    }

    private static double avgOfSmth(List<Student> list
            , Function<Student, Double> f) {
        double result = 0;
        for (Student s : list) {
            result += f.apply(s);
        }
        return result = result / list.size();
    }
}

interface StudentChecks {
    boolean check(Student s);
}
//class CheckOverGrade implements StudentChecks{
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade>8;
//    }
//}