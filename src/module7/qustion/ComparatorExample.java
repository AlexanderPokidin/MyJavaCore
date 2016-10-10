package module7.qustion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(26);
        list.add(9);
        list.add(41);
        list.add(26);
        list.add(-6);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        System.out.println(list);

        list.sort(comparator);

        System.out.println(list);


        String[] strings = new String[4];
        strings[0] = "Bali";
        strings[1] = "India";
        strings[2] = "USA";
        strings[3] = "China";

        Arrays.sort(strings);
        System.out.println(Arrays.deepToString(strings));

        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };
        Arrays.sort(strings, c);
        System.out.println(Arrays.deepToString(strings));

    }
}
