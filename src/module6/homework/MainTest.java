package module6.homework;

public class MainTest {


    public static void main(String[] args) {
        int testArray[] = {5, 7, 53, -6, 34, -1, 2};

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
        User[] users = {user1, user2, user3, user4, user5, user6, user7, user8, user9, user10};




        System.out.println(UserUtils.uniqueUsers(users).toString());
        System.out.println(UserUtils.usersWithContitionalBalance(users, 6300));


//        System.out.println(ArraysUtils.sum(testArray));
//        System.out.println(ArraysUtils.min(testArray));
//        System.out.println(ArraysUtils.maxPositive(testArray));
//        System.out.println(ArraysUtils.multiplication(testArray));
//        System.out.println(ArraysUtils.modulus(testArray));
//        System.out.println(ArraysUtils.secondLargest(testArray));
//        System.out.println(ArraysUtils.findEvenElements(testArray).toString());
//        System.out.println();





    }
}
