import static java.lang.Math.random;

public class Salary {
    String from;
    String to;
    int salary;

    public Salary(String from, String to, int salary) {
        this.from = from;
        this.to = to;
        this.salary = salary;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public int getSalary() {
        return salary;
    }
}
