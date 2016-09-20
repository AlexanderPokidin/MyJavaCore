package module6.offline5;

public class User {

    private static int counter = 0;

    public User() {
        counter = counter +1;
    }

    public static int getCounter() {
        return counter;
    }
}
