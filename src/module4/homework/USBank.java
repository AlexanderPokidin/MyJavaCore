package module4.homework;

public class USBank extends Bank{

    @Override
    int getLimitOfWithdrawAll() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 1000;
        else limit = 1200;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int fund;
        if (getCurrency() == Currency.EUR) fund = 10000;
        else fund = Integer.MAX_VALUE;
        return fund;
    }

    @Override
    int getMonthluRate() {
        int rate;
        if (getCurrency() == Currency.USD) rate = 1;
        else rate = 2;
        return rate;
    }

    @Override
    int getCommission(int summ) {
        int commission;
        if (getCurrency() == Currency.USD) {
            if (summ < 1000) commission = summ / 100 * 5;
            else commission = summ / 100 * 7;
        }
        else {
            if (summ < 1000) commission = summ / 100 * 6;
            else commission = summ / 100 * 8;
        }
        return commission;
    }
}
