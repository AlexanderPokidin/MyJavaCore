package module11.offline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RaedFromConsole {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Double> doubles = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        String line;
        while (!(line = reader.readLine()).equals("q")) {
            try {
//                double res = Double.valueOf(line);
//                doubles.add(res);
                integers.add(Integer.valueOf(line));
            } catch (NumberFormatException e) {
                try {
                    doubles.add(Double.valueOf(line));
                } catch (NumberFormatException e1) {
                    strings.add(line);
                }
            }
        }
        reader.close();

        if (!integers.isEmpty()) {
            System.out.println(integers);
        }

        if (!doubles.isEmpty()) {
            System.out.println(doubles);
        }

        if (!strings.isEmpty()) {
            System.out.println(strings);
        }
    }
}
