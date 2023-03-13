package JavaBlackBelt.lambda;

public class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", course=").append(course);
        sb.append(", avgGrade=").append(avgGrade);
        sb.append('}');
        return sb.toString();
    }
}
