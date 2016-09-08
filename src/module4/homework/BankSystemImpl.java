package module4.homework;

public class BankSystemImpl implements BankSystem{
    @Override
    public void withdrawOfUser(User user, int summ) {
        Bank userBank = user.getBank();
        if (userBank.getLimitOfWithdrawAll() >= summ + userBank.getCommission(summ)) {
            double newBalance = user.getBalance() - summ - userBank.getCommission(summ);
            user.setBalance(newBalance);
        }
    }

    @Override
    public void fundUser(User user, int summ) {
        Bank userBank = user.getBank();
        if (userBank.getLimitOfFunding() >= summ) {
            double newBalance = user.getBalance() + summ;
            user.setBalance(newBalance);
        }

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int summ) {

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
