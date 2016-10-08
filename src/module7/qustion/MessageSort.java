package module7.qustion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class MessageSort {
    public static void main(String[] args) {
        Set<Message> messageSet = new TreeSet<>();

        messageSet.add(new Message("Hello. It`s me", "Mobile"));
        messageSet.add(new Message("Where are you from?", "PC"));
        messageSet.add(new Message("I`m fine. Thanks", "Mobile"));

        System.out.println(messageSet);

        Message[] msgs = new Message[2];
        msgs[0] = new Message("Hello. It`s me", "Mobile");
        msgs[1] = new Message("Where are you from?", "PC");

        SortMessages sortMessages = new SortMessages();
        Arrays.sort(msgs, sortMessages);
//        System.out.println(Arrays.deepToString(msgs));

        Comparator<Message> comparator = new Comparator<Message>() {
            @Override
            public int compare(Message m1, Message m2) {
                return countSpaces(m1) - countSpaces(m2);
            }
        };

        Arrays.sort(msgs, comparator);
        System.out.println(Arrays.deepToString(msgs));
    }
    public static int countSpaces(Message m) {
        int counter = 0;
        for (String item : m.getMessage().split("")){
            if (item.equals(" "))
            counter++;
        }
        return counter;
    }
}
