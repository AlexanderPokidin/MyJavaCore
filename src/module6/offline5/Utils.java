package module6.offline5;

public class Utils {
    public static String removeChsr(char letter, String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != letter) {
                result = result + text.charAt(i);
            }
        }
        return result;
    }



}
