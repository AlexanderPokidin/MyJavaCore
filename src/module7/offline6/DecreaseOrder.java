package module7.offline6;

import java.util.Comparator;

public class DecreaseOrder implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }

}
