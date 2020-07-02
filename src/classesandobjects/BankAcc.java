package classesandobjects;

public class BankAcc {
    int id;
    String name;
    double balance;
    }

    class BankAccTest {
        public static void main(String[] args) {

                BankAcc bA1 = new BankAcc();
                BankAcc bA2 = new BankAcc();
                BankAcc bA3 = new BankAcc();
                BankAcc bA4 = new BankAcc();
                BankAcc bA5 = new BankAcc();

                bA1.id = 2465;
                bA1.name = "Lelek";
                bA1.balance = 312.65;

                bA2.id = 2466;
                bA2.name = "Bolek";
                bA2.balance = 3.64;

                bA3.id = 2467;
                bA3.name = "Molek";
                bA3.balance = 900.3;

                System.out.println(bA1.id);
        }
    }

