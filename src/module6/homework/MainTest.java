package module6.homework;

public class MainTest {


    public static void main(String[] args) {

        User user1 = new User(25, "Oleg", "Petrov", 500, 5700);
        User user2 = new User(27, "Taras", "Petrov", 700, 5300);
        User user3 = new User(29, "Ivan", "Kozlov", 900, 8400);
        User user4 = new User(26, "Kirill", "Pavlov", 550, 6300);
        User user5 = new User(25, "Oleg", "Petrov", 500, 5700);
        User user6 = new User(29, "Ivan", "Kozlov", 900, 8400);
        User user7 = new User(28, "Vadim", "Tarasov", 600, 5900);
        User user8 = new User(26, "Kirill", "Pavlov", 550, 6300);
        User user9 = new User(25, "Oleg", "Petrov", 500, 5700);
        User user10 = new User(29, "Ivan", "Kozlov", 900, 8400);
        User users[] = {user1, user2, user3, user4, user5, user6, user7, user8, user9, user10};

        UserUtils.usersWithContitionalBalance(users, 8400);
        System.out.println("usersWithContitionalBalance done");
        UserUtils.getUsersId(users);
        System.out.println("getUsersId done");
        UserUtils.paySalaryToUsers(users);
        System.out.println("paySalaryToUsers done");
        UserUtils.deleteEmptyUsers(users);
        System.out.println("deleteEmptyUsers done");

        UserUtils.uniqueUsers(users);
        System.out.println("uniqueUsers done");

    }
}
