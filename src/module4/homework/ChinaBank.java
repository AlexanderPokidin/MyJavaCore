package module4.homework;

public class ChinaBank extends Bank {
    @Override
    int getLimitOfWithdrawAll() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 100;
        else limit = 150;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int fund;
        if (getCurrency() == Currency.USD) fund = 10000;
        else fund = 5000;
        return fund;
    }

    @Override
    int getMonthluRate() {
        int rate;
        if (getCurrency() == Currency.USD) rate = 1;
        else rate = 0;
        return rate;
    }

    @Override
    int getCommission(int summ) {
        int commission;
        if (getCurrency() == Currency.USD) {
            if (summ < 1000) commission = summ / 100 * 3;
            else commission = summ / 100 * 5;
        } else {
            if (summ < 1000) commission = summ / 10;
            else commission = summ / 100 * 11;
        }
        return 0;
    }
}
