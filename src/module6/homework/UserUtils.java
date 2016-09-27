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
/*
    private static User[] usersWithContitionalBalance(User[] users, int balance) {};

    private final static User[] paySalaryToUsers(User[] users) {};

    private final static long[] getUsersId(User[] users) {};

    private static User[] deleteEmptyUsers(User[] users) {
        for (item : users) {}
    };
*/
}
