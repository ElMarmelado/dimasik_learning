package classesandobjects;

import java.text.DecimalFormat;

public class Student {
    Student(int id, String name, String surname, int course, double mathAverGrade, double ecoAverGrade, double enlangAverGrade) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.mathAverGrade = mathAverGrade;
        this.ecoAverGrade = ecoAverGrade;
        this.enlangAverGrade = enlangAverGrade;
    }

    Student(int id, String name, String surname, int course) {
        this(id, name,  surname, course, 0, 0, 0);
    }
    Student(){}

    int id;
    String name;
    String surname;
    int course;
    double mathAverGrade;
    double ecoAverGrade;
    double enlangAverGrade;

    static DecimalFormat formattedDouble = new DecimalFormat("#0.0");

    public void print() {
        System.out.println("Средняя оценка защитника родины" + " " + name + " " + surname + ":" + " " + formattedDouble.format((mathAverGrade + ecoAverGrade + enlangAverGrade) / 3));
    }
}