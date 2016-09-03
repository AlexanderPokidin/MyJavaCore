package module2.testpackage;

import java.util.Arrays;

/**
 * Created by unit on 24.08.2016.
 */
public class TestClass2 {
    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    static double fundBalance(String ownerName, double fund) {
        double sumBalance = 0;
        double result = 0;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i] == ownerName) {
                sumBalance = balances[i];
            } result = sumBalance + fund;
        }
        return result;
    }

    public static void main(String[] args) {
        String ownerName = "Oww";
        double fund = 100;

        System.out.println(ownerName + " " + fundBalance(ownerName, fund));

    }
}


