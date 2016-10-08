package module6.homework;

public class UserUtils {

    public static User[] uniqueUsers(User[] users) {
        int i, j;
        for (i = 0; i < users.length; i++) {
            for (j = i + 1; j < users.length; ++j)
                if (users[i] != null){
                    if (users[i].equals(users[j]) && i != j) {
                        users[j] = null;
                    }
                }
            }
        return users;
    }

    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        int i;
        int count = 0;
        for (i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                count++;
            }
        }
        User[] contBalance = new User[count];
        for (i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                contBalance[i] = users[i];
            }
        }
        return contBalance;
    }

    public final static long[] getUsersId(User[] users) {
        long[] usersId = new long[users.length];
        int i;
        for (i = 0; i < users.length; i++) {
            usersId[i] = users[i].getId();
        }
        return usersId;
    }


    public final static User[] paySalaryToUsers(User[] users) {
        int i;
        for (i = 0; i < users.length; i++) {
            users[i].setBalance(users[i].getBalance() + users[i].getSalary());
        }
        return null;
    }

    public static User[] deleteEmptyUsers(User[] users) {
        int count = 0;
        int i, j = 0;
        for (i = 0; i < users.length; i++) {
            if (users[i] != null) {
                count++;
            }
        }
        User[] emptyUsers = new User[count];
        for (i = 0; i < users.length; i++) {
            if (users[i] != null) {
                emptyUsers[j] = users[i];
                j++;
            }
        }
        return emptyUsers;
    }
}
