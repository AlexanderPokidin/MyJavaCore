package module2.practice;


public class Task3 {

    static double withdrawBalance(double balance, double withdraw, double comission) {
        // double commission = 1.5;
        return balance - withdraw - comission;
    }

    public static void main(String[] args) {
        //double balance = 100;
        //double withdraw = 30.5;
        //double comission = 1.5;

        double balanceAfter = withdrawBalance(100, 30.5, 1.5);

        if (balanceAfter > 0) {
            System.out.println("OK");
            System.out.println(balanceAfter);
        }
        else {
            System.out.println("NO");
        }
    }
}
