package module7.offline6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WarmUpTask2 {
    List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Kiev");
        list.add("Yalta");
        list.add("Praga");
        list.add("London");
        list.add("Odessa");

        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println(list);

        list.sort(c);

        System.out.println(list);
    }


}
