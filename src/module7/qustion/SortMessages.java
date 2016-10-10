package module7.qustion;

import java.util.Comparator;

public class SortMessages implements Comparator<Message> {

    @Override
    public int compare(Message o1, Message o2) {
        return o1.getDevice().compareTo(o2.getDevice());
    }
}