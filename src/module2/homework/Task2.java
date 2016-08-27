package module2.homework;

import java.util.Arrays;

public class Task2 {
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    static int[] balances = {1200, 250, 2000, 500, 3200};

    static int balancesSum(int[] balances) {
        int sum = 0;
        for (int balance : balances) {
            if (balance > 1000 && balance < 5000) {
                sum += balance;
            }
        }
        return sum;
    }

    static String[] getOwnerNames(int[] balances, String[] names) {
        int ownersCount = 0;
        for (int balance : balances) {
            if (balance > 1000) ownersCount++;
        }

        String[] result = new String[ownersCount];

        int index = 0;
        for (int i = 0; i < balances.length; i++) {
            if (balances[i] > 1000) {
                result[index] = names[i];
                index++;
            }
        }

        return result;
    }

    ///*тип возвращаемого значения*/void  /*название метода*/ (/*параметры*/) {
    //логика

    //return //что-то
    //}

    int testMethod(int element, double test1, char pool) {
        //logic
        return 0;
    }

    void testMethod2(int test, String name) {
        //logic
        System.out.println("test....");

    }

    //параметры
    //тип значения название параметра

    //HOMEWORK 2.1
    static double withdrawBalance(double balance, double withdrawal) {
        double commission =  withdrawal * 0.05;
        double result = balance - withdrawal - commission;

        return result;
    }

    //HOMEWORK 2.2
    static double withdrawBalance(String ownerName, double withdrawal) {
        double sumBalanse = 0;
        double commission =  withdrawal * 0.05;
        double result = 0;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i] == ownerName) {
                sumBalanse = balances[i];
            } result = sumBalanse - withdrawal - commission;
        }
        return result;
    }

    //HOMEWORK 2.3
    static double fundBalance(String ownerName, double fund) {

        return 0;
    }

    public static void main(String[] args) {
        double balance = 100;
        double withdrawal = 100;
        double commission = withdrawal * 0.05;
        String ownerName = "Ann";

        if (withdrawBalance(balance, withdrawal) >= 0) {
            System.out.println("OK " + commission + " " + withdrawBalance(balance, withdrawal));
        } else {
            System.out.println("NO");
        }

        if (withdrawBalance(ownerName, withdrawal) >= 0) {
            System.out.println(ownerName + " " + withdrawal + " " + withdrawBalance(ownerName, withdrawal));
        } else {
            System.out.println(ownerName + " NO");
        }

        int[] balances1 = {200, 200, 500, 4000, 30};
    }

}
