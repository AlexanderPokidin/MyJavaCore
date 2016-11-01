package module10.homework;

public class Main {
    public static void main(String[] args) {
        String str = null;

        try {
            str.toUpperCase();

        } catch (NullPointerException e){
            System.out.println("String is null");
        } finally {
            System.out.println("Method is done");
        }
    }
}
