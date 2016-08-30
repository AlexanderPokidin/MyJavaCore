package module3.homework.task2;


public class Adder extends Arithmetic {
    boolean check(Integer a, Integer b) {
        boolean result = false;
        if (a >= b)
            result = true;

        return result;
    }
}
