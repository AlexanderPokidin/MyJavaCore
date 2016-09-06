package module4.offline3.Converter;

public class Main {
    public static void main(String[] args) {
        MoneyConverter moneyConverter = new Calc();
        Calc calc = new Calc();

        demonstrate(calc, 100);
    }

    private static void demonstrate (MoneyConverter moneyConverter, int moneyCount) {
        System.out.println(moneyConverter.convertFromUsd(moneyCount));
    }

    //BAD
    //private static void demonstrate(Calc calc, int moneyCount) {
      //  System.out.println(calc.convertFromUsd(moneyCount));
}

