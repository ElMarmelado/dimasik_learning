package classesandobjects;

public class Meth {
    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
}
class testMeth {
        public static void main(String[] args) {
            Meth tipe = new Meth();
            int sum3chisel = tipe.summa(1, 2, 3);
            System.out.println(sum3chisel);
        }
}
