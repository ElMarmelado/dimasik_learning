package classesandobjects;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Иванов", 45);
        emp1.print();

        Employee emp2 = new Employee("Петров", 36);
        emp2.print();

        Employee emp3 = new Employee(2, "Козлов", 28, 2300, "конюх");
        emp3.print();

    }
}
