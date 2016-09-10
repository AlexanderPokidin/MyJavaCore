package module4.homework;

public class BankSystemImpl implements BankSystem{

    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();
        if (userBank.getLimitOfWithdrawAll() >= amount + userBank.getCommission(amount)) {
            double newBalance = user.getBalance() - amount - userBank.getCommission(amount);
            user.setBalance(newBalance);
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        Bank userBank = user.getBank();
        if (userBank.getLimitOfFunding() >= amount) {
            double newBalance = user.getBalance() + amount;
            user.setBalance(newBalance);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double newBalanceFrom = fromUser.getBalance() - amount;
        fromUser.setBalance(newBalanceFrom);
        double newBalanceTo = toUser.getBalance() + amount;
        toUser.setBalance(newBalanceTo);
    }

    @Override
    public void paySalary(User user) {
        Bank userBank = user.getBank();
        if (userBank.getLimitOfFunding() >= user.getSalary()) {
            double newBalance = user.getBalance() + user.getSalary();
            user.setBalance(newBalance);
        }
    }
}
