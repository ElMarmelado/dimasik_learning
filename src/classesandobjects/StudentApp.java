package classesandobjects;

import java.text.DecimalFormat;


public class StudentApp {

    public static void main(String[] args) {
        // halo
        Student st1 = new Student();
        st1.id = 1;
        st1.name = "Гошка";
        st1.surname = "Кисимяка";
        st1.course = 2;
        st1.mathAverGrade = 2.3;
        st1.ecoAverGrade = 3.5;
        st1.enlangAverGrade = 3.2;

        Student st2 = new Student();
        st2.id = 2;
        st2.name = "Санька";
        st2.surname = "Руконогов";
        st2.course = 2;
        st2.mathAverGrade = 2.7;
        st2.ecoAverGrade = 2.8;
        st2.enlangAverGrade = 4.7;

        Student st3 = new Student();
        st3.id = 3;
        st3.name = "Костик";
        st3.surname = "Бабулех";
        st3.course = 2;
        st3.mathAverGrade = 2.5;
        st3.ecoAverGrade = 3.9;
        st3.enlangAverGrade = 2.8;

        Student st4 = new Student(4, "Лёха", "Башмаков", 87, 3,2,3);
        st4.print();
        Student st5 = new Student(5, "Никитка", "Катышков",1);
        st5.print();
        Student st6 = new Student();
        st6.print();

        st1.print();
        st2.print();
        st3.print();

    }
}
