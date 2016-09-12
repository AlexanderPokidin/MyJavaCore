package module4.homework;

public class Main {
    public static void main(String[] args) {

        Bank usBank = new USBank();
        usBank.setCurrency(Currency.USD);

        Bank euBank = new EUBank();
        euBank.setCurrency(Currency.EUR);

        Bank chBank = new ChinaBank();
        chBank.setCurrency(Currency.USD);

        User userUS1 = new User(524757, "Ivanov", 15784, 21,"Toshiba", 2500, usBank);
        //userUS1.setBalance(3200);
        //userUS1.setBank(usBank);

        //System.out.println(userUS1);

        User userUS2 = new User(875423, "Petrov", 28574, 36, "Sony", 3200, usBank);
        User userEU1 = new User(587623, "Kozlov", 23110, 54, "Sega", 4012, euBank);
        User userEU2 = new User(885452, "Potapov", 21457, 13, "Blizzard", 5000, euBank);
        User userCh1 = new User(457896, "Saharov", 55210, 28, "Lenovo", 3020, chBank);
        User userCh2 = new User(896985, "Frolov", 23521, 54, "Meizu", 3000, chBank);

        BankSystem bankSystem = new BankSystemImpl();

        bankSystem.withdrawOfUser(userUS1, 800);
        System.out.println(userUS1);

        bankSystem.fundUser(userUS1,3200);
        System.out.println(userUS1);

        bankSystem.transferMoney(userUS1, userUS2, 999);
        System.out.println(userUS1);

        bankSystem.paySalary(userUS1);
        System.out.println(userUS1);
        System.out.println(" ");

        bankSystem.withdrawOfUser(userUS2, 800);
        System.out.println(userUS2);

        bankSystem.fundUser(userUS2,3200);
        System.out.println(userUS2);

        bankSystem.transferMoney(userUS2, userUS1, 999);
        System.out.println(userUS2);

        bankSystem.paySalary(userUS2);
        System.out.println(userUS2);
        System.out.println(" ");

        bankSystem.withdrawOfUser(userEU1, 800);
        System.out.println(userEU1);

        bankSystem.fundUser(userEU1,3200);
        System.out.println(userEU1);

        bankSystem.transferMoney(userEU1, userEU2, 999);
        System.out.println(userEU1);

        bankSystem.paySalary(userEU1);
        System.out.println(userEU1);
        System.out.println(" ");

        bankSystem.withdrawOfUser(userEU2, 800);
        System.out.println(userEU2);

        bankSystem.fundUser(userEU2,3200);
        System.out.println(userEU2);

        bankSystem.transferMoney(userEU2, userEU1, 999);
        System.out.println(userEU2);

        bankSystem.paySalary(userEU2);
        System.out.println(userEU2);
        System.out.println(" ");

        bankSystem.withdrawOfUser(userCh1, 800);
        System.out.println(userCh1);

        bankSystem.fundUser(userCh1,3200);
        System.out.println(userCh1);

        bankSystem.transferMoney(userCh1, userCh2, 999);
        System.out.println(userCh1);

        bankSystem.paySalary(userCh1);
        System.out.println(userCh1);
        System.out.println(" ");

        bankSystem.withdrawOfUser(userCh2, 800);
        System.out.println(userCh2);

        bankSystem.fundUser(userCh2,3200);
        System.out.println(userCh2);

        bankSystem.transferMoney(userCh2, userCh1, 999);
        System.out.println(userCh2);

        bankSystem.paySalary(userCh2);
        System.out.println(userCh2);






    }
}
