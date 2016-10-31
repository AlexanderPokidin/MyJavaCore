package module11.offline;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class GooglePage {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://google.com");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line + System.lineSeparator());
        }
        reader.close();


        String result = stringBuilder.toString()
                .replaceAll("google", "yandex")
                .replaceAll("Google", "Yandex");

        try (Writer writer = new BufferedWriter
                (new OutputStreamWriter(new FileOutputStream("newDoc.txt"), StandardCharsets.UTF_8))) {
            writer.write(result);
        }
    }
}

