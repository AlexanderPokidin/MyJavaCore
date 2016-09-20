package module6.offline5;

public class Main {
    public static void main(String[] args) {
        System.out.println("First user count " + User.getCounter());

        new User();
        new User();
        new User();
        new User();
        new User();
        new User();
        new User();
        new User();

        System.out.println("After creating users, counts = " + User.getCounter());
    }


}
