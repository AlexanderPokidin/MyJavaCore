package module3.offline2.Task1;

public class Main {

    public static void main(String[] args) {
        Converter converter = new Converter(26.3);
        converter.convertGRNtoUSD(100);

        System.out.println(converter.convertGRNtoUSD(100));

        /*double usd = converter.convertGRNtoUSD(100);
        System.out.println(usd);*/


    }

}
