package JavaBlackBelt.comparation;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Artur", "Makaryuk", 10000);
        Employee emp2 = new Employee(15, "Elena", "Makaryuk", 412300);
        Employee emp3 = new Employee(230, "Ivan", "Petrov", 12441);
        /*
        Arrays.sort(new Employee[] {emp1, emp2, emp3}); Без интерфейса Comparable - выкинет exeption
         т.е. java не понимает по какому принципу делать сортировку
        */
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting \n" + list);
        Collections.sort(list);
        System.out.println("After sorting by ID with Comparable interface \n" + list);
        Collections.sort(list, new IdComparator());
        System.out.println("After sorting by ID with Comparator interface\n" + list);
        Collections.sort(list, new NameComparator());
        System.out.println("After sorting by name and surname with Comparator interface\n" + list);
        Collections.sort(list, new SalaryComparator());
        System.out.println("After sorting by salary with Comparator interface\n" + list);
    }

}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        if (this.id == anotherEmp.id) {
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;
        } else {
            return 1;
        }
//        Либо можно написать так, что в целом одно и то же
//        return this.id - anotherEmp.id;
//        Либо вот так, если у нас id класса Integer
//        return this.id.compareTo(anotherEmp.id);
//        Если сравнивать будем по имени
//        int res = this.name.compareTo(anotherEmp.name);
//        Если имена одинаковые
//        if (res == 0) {
//            сравниваем по фамилии
//                    res = this.surname.compareTo(anotherEmp.surname);
//        }
//        return res;

    }
}

class IdComparator implements Comparator<Employee> {
    // Этот метод имеет такую же логику что и compareTo
    // но в этом мы сравниваем не текущий объект с другим объектом, а просто два объекта
    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.id == emp2.id) {
            return 0;
        } else if (emp1.id < emp2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        int res = emp1.name.compareTo(emp2.name);
//           Если имена одинаковые
        if (res == 0) {
//               сравниваем по фамилии
            res = emp1.surname.compareTo(emp2.surname);
        }
        return res;
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}
