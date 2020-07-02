package classesandobjects;

public class MethOverloadingTest {
    public static void main(String[] args) {
        MethOverloading mO = new MethOverloading();
        int a = 344;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        String s = "string";
        mO.show(s);
    }
}
