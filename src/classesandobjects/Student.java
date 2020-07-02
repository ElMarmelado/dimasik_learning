package classesandobjects;

import java.text.DecimalFormat;

public class Student {
    int studentId;
    String name;
    String surname;
    int course;
    double mathAverGrade;
    double ecoAverGrade;
    double EnlangAverGrade;


    static DecimalFormat formattedDouble = new DecimalFormat("#0.0");

    public void print() {
        System.out.println("Средняя оценка защитника родины" + " " + name + " " + surname + ":" + " " + formattedDouble.format((mathAverGrade + ecoAverGrade + EnlangAverGrade) / 3));
    }
}