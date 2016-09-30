package module6.homework;

public class UserUtils {

    public static User[] uniqueUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(users)) {
                users[i] = null;
            }
        }
        return users;
    }

    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] contBalance = new User[10];
        int i;
        for (i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance);
            contBalance[i] = users[i];
        }
        return contBalance;
    };
/*
    private final static User[] paySalaryToUsers(User[] users) {};

    private final static long[] getUsersId(User[] users) {};

    private static User[] deleteEmptyUsers(User[] users) {
        for (item : users) {}
    };
*/
}
