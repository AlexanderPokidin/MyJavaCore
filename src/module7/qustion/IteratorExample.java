package module7.qustion;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IteratorExample {
    public static void main(String[] args) {
        Set<Message> messageSet = new TreeSet<>();

        messageSet.add(new Message("Hello. It`s me", "Mobile"));
        messageSet.add(new Message("Where are you from? test", "PC"));
        messageSet.add(new Message("I`m fine. Thanks", "Mobile"));



        //Example - print all messages
        Iterator<Message> iterator = messageSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getMessage());
        }

        //Example - delite if contains
        Iterator<Message> iterator1 = messageSet.iterator();
        while (iterator1.hasNext()) {
            Message msg = iterator1.next();
            if (msg.getMessage().contains("test")) iterator1.remove();
        }

        System.out.println(messageSet);
    }

}
