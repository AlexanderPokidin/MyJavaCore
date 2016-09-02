package module3.offline2.Task1;

public class Converter {

    private final double rate;

    public Converter(double rate) {
        this.rate = rate;
    }

    public double convertGRNtoUSD(double grn) {
        return grn / rate;
    }

}
