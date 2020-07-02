package classesandobjects;

public class Employee {

    Employee(int id, String surname, int age) {

        this(id, surname, age, 0, null);
//        this.id = id;
//        this.surname = surname;
//        this.age = age;
    }

    Employee(String surname, int age) {

        this(0, surname, age, 0, null);
//        this.surname = surname;
//        this.age = age;
    }

    Employee(int id, String surname, int age, int salary, String department) {

        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.departament = department;
    }

    int id;
    String surname;
    int age;
    double salary;
    String departament;


    public void print() {
        System.out.println("id " +id + " job: " +departament + " surname " + "pay " +salary +" "+surname);
    }
}
