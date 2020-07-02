package classesandobjects;

import java.text.DecimalFormat;


public class StudentApp {

    public static void main(String[] args) {
        // halo
        Student st1 = new Student();
        st1.studentId = 1;
        st1.name = "Гошка";
        st1.surname = "Кисимяка";
        st1.course = 2;
        st1.mathAverGrade = 2.3;
        st1.ecoAverGrade = 3.5;
        st1.EnlangAverGrade = 3.2;

        Student st2 = new Student();
        st2.studentId = 2;
        st2.name = "Санька";
        st2.surname = "Руконогов";
        st2.course = 2;
        st2.mathAverGrade = 2.7;
        st2.ecoAverGrade = 2.8;
        st2.EnlangAverGrade = 4.7;

        Student st3 = new Student();
        st3.studentId = 3;
        st3.name = "Костик";
        st3.surname = "Бабулех";
        st3.course = 2;
        st3.mathAverGrade = 2.5;
        st3.ecoAverGrade = 3.9;
        st3.EnlangAverGrade = 2.8;

        st1.print();
        st2.print();
        st3.print();

    }
}
