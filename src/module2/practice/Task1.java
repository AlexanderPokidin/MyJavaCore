package module2.practice;


public class Task1 {

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
        int ownerCount = 0;
        for (int balance : balances) {
            if (balance > 1000) ownerCount++;
        }

        String[] result = new String[ownerCount];

        int index = 0;
        for (int i = 0; i < balances.length; i++) {
            if (balances[i] > 1000) {
                result[index] = names[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        int[] balances1 = {200, 200, 500, 4000, 30};


        for (String name : getOwnerNames(balances, ownerNames)) {
            System.out.println(name + " ");
        }
    }



}
