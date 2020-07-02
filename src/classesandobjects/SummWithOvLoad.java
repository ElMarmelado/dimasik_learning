package classesandobjects;

/**
 * 5 оверлоад методов для сумм 0, 1, 2, 3, 4 чисел с аутпут и выводом на экран, при отсутствии слагаемых результат =0
 */
public class SummWithOvLoad {

    static int summa(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    static int summa(int a, int b, int c) {
        return a + b + c;
    }
    static int summa(int a, int b) {
        return a + b;
    }
    static int summa(int a) {
        return a;
    }
    static int summa(){
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(summa(1,4,8,8));
        System.out.println(summa(2, 2, 8));
        System.out.println(summa(6,9));
        System.out.println(summa(6));
        System.out.println(summa());

    }
}