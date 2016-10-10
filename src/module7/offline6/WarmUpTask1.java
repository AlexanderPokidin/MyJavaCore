package module7.offline6;

import java.util.ArrayList;
import java.util.List;

public class WarmUpTask1 {
    List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(20);

        list.sort(new IncreaseOrder());

        System.out.println(list);

//        Comparator<Integer> c = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        };
//        list.sort(c);
//        System.out.println(list);
    }
}
