package module4.homework;

public class EUBank extends Bank {

    @Override
    int getLimitOfWithdrawAll() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 2000;
        else limit = 2200;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int fund;
        if (getCurrency() == Currency.USD) fund = 10000;
        else fund = 20000;
        return fund;
    }

    @Override
    int getMonthluRate() {
        int rate;
        if (getCurrency() == Currency.EUR) rate = 1;
        else rate = 0;
        return rate;
    }

    @Override
    int getCommission(int summ) {
        int commission;
        if (getCurrency() == Currency.USD) {
            if (summ < 1000) commission = summ / 100 * 5;
            else commission = summ / 100 * 7;
        } else {
            if (summ < 1000) commission = summ / 100 * 2;
            else commission = summ / 100 * 4;
        }
        return commission;
    }
}
