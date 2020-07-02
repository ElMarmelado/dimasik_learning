package classesandobjects;

public class ClObj {
    public static void main(String[] args) {
        shmain(false, 0);
        jobba();
        System.out.println(3 + quadro(3));
    }
    public static void shmain(boolean loh, int п) {
        if(loh) {
            System.out.println("лошара");
        } else {
            System.out.println("красава");
        }
    }
    public static void jobba() {
        System.out.println("лошара");
    }
    public static int quadro(int e) {
        return e*e;
    }
}
