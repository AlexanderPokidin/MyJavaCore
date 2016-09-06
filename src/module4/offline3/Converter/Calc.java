package module4.offline3.Converter;

public class Calc implements MoneyConverter{
    private static final int k = 26;

    @Override
    public double convertFromUsd(int i) {
        return k * i;
    }
}
