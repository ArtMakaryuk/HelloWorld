package JavaBlackBelt.generics.Igra;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("����", 15);
        Schoolar schoolar2 = new Schoolar("�����", 14);
        Schoolar schoolar3 = new Schoolar("������", 16);
        Schoolar schoolar4 = new Schoolar("�����", 13);

        Student student1 = new Student("�������", 20);
        Student student2 = new Student("������", 22);

        Employee employee1 = new Employee("�������", 43);
        Employee employee2 = new Employee("������", 34);

        Team<Schoolar> schoolarTeam = new Team<>("�������");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
//        schoolarTeam.addNewParticipant(student1);

        Team<Schoolar> schoolarTeam2 = new Team<>("�������");
        schoolarTeam.addNewParticipant(schoolar3);
        schoolarTeam.addNewParticipant(schoolar4);

        Team<Student> studentTeam = new Team<>("������");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("��������");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

//        Team<String> anotherTeam = new Team<>("��������");
//        anotherTeam.addNewParticipant("�����");
//        anotherTeam.addNewParticipant("�����");
        schoolarTeam.playWith(schoolarTeam2);
//        studentTeam.playWith(schoolarTeam2);
    }
}
