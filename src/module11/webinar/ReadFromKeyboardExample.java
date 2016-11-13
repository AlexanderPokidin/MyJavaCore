package module11.webinar;

import java.io.InputStream;
import java.util.Scanner;

public class ReadFromKeyboardExample {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()) {
            String read = scanner.next();

            int res;
            try {
                res = Integer.valueOf(read);
                System.out.println(res - 1000);
            } catch (NumberFormatException e) {
                System.err.println("Wrong input");
            }
        }
        scanner.close();
    }
}
