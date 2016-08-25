package module2.testpackage;

import java.util.Arrays;

/**
 * Created by unit on 24.08.2016.
 */
public class TestClass2 {
    static int[] balances = {1200, 250, 2000, 500, 3200};

    static double withdrawBalance(double balance, double withdrawal) {
        double commission =  withdrawal * 0.05;
        double result = balance - withdrawal - commission;
        return result;
    }


    public static void main(String[] args) {
        double balance = 100;
        double withdrawal = 10;
        double commission =  withdrawal * 0.05;

        if (withdrawBalance(balance, withdrawal) >= 0) {
            System.out.println("OK " + commission + " " + withdrawBalance(balance, withdrawal));
        } else {
            System.out.println("NO");
        }



    }



}


