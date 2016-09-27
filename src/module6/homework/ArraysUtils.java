package module6.homework;

public final class ArraysUtils {

    public static int sum(int array[]) {
        int sumOfArray = 0;
        for (int item : array) {
            sumOfArray += item;
        }
        return sumOfArray;
    }

    public static int min(int array[]) {
        int minOfArray = array[0];
        for (int item : array) {
            if (minOfArray >= item) {
                minOfArray = item;
            }
        }
        return minOfArray;
    }

    public static int max(int array[]) {
        int maxOfArray = array[0];
        for (int item : array) {
            if (maxOfArray <= item) {
                maxOfArray = item;
            }
        }
        return maxOfArray;
    }

    public static int maxPositive(int array[]) {
        int maxPosOfArray = 0;
        for (int item : array) {
            if (maxPosOfArray < item) {
                maxPosOfArray = item;
            }
        }
        return maxPosOfArray;
    }

    public static int multiplication(int array[]) {
        int multArray = array[0];
        for (int item : array) {
            multArray *= item;
        }
        return multArray;
    }

    public static int modulus(int array[]) {
        int firstOfArray = array[0];
        int lastOfArray = array[array.length-1];
        int modArray = firstOfArray % lastOfArray;
        return modArray;
    }

    public static int secondLargest(int array[]) {
        int firstLargOfArray = array[0];
        int secLargOfArray = array[0];
        for (int item : array) {
            if (firstLargOfArray <= item) {
                firstLargOfArray = item;
            } if (item < firstLargOfArray && item >= secLargOfArray){
                secLargOfArray = item;
            }
        }
        return secLargOfArray;
    }

    public static int[] reverse(int array[]) {
        int[] revArray = new int[array.length];
        int i = array.length-1;

        for (int item : array) {
            revArray[i] = item;
            i--;
        }
        return revArray;
    }

    public static int[] findEvenElements(int array[]) {
        int[] foundElem = new int[array.length];
        for (int item : array) {
            if (item % 2 == 0) {
                int i = 0;
                foundElem[i] = item;
                i++;
            }
        }
        return foundElem;
    }
}
