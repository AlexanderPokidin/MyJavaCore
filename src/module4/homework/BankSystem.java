package module4.homework;

public interface BankSystem {

    void withdrawOfUser(User user, int summ);
    void fundUser(User user, int summ);
    void transferMoney(User fromUser, User toUser, int summ);
    void paySalary(User user);


}
