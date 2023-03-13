package JavaBlackBelt.generics.Igra;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Иван", 15);
        Schoolar schoolar2 = new Schoolar("Мария", 14);
        Schoolar schoolar3 = new Schoolar("Сергей", 16);
        Schoolar schoolar4 = new Schoolar("Дарья", 13);

        Student student1 = new Student("Дмитрий", 20);
        Student student2 = new Student("Ксения", 22);

        Employee employee1 = new Employee("Василий", 43);
        Employee employee2 = new Employee("Регина", 34);

        Team<Schoolar> schoolarTeam = new Team<>("Драконы");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
//        schoolarTeam.addNewParticipant(student1);

        Team<Schoolar> schoolarTeam2 = new Team<>("Мудрецы");
        schoolarTeam.addNewParticipant(schoolar3);
        schoolarTeam.addNewParticipant(schoolar4);

        Team<Student> studentTeam = new Team<>("Вперед");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Работяги");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

//        Team<String> anotherTeam = new Team<>("Фантазия");
//        anotherTeam.addNewParticipant("Хелло");
//        anotherTeam.addNewParticipant("Агага");
        schoolarTeam.playWith(schoolarTeam2);
//        studentTeam.playWith(schoolarTeam2);
    }
}
