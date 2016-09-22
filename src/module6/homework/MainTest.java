package module6.homework;

public class MainTest {
    public static void main(String[] args) {
        int testArray[] = {5, 7, 53, -6, 34, -1, 2};

        System.out.println(ArraysUtils.min(testArray));
        System.out.println(ArraysUtils.maxPositive(testArray));
        System.out.println(ArraysUtils.multiplication(testArray));
        System.out.println(ArraysUtils.modulus(testArray));
        System.out.println(ArraysUtils.secondLargest(testArray));
        System.out.println(ArraysUtils.findEvenElements(testArray));

    }
}
