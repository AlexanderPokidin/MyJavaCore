package module7.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timer {
    public static void main(String[] args) {

        List<Integer> integerArrayList = new ArrayList<>();
        List<Integer> integerLinkedList = new LinkedList<>();
        List<String> stringArrayList = new ArrayList<>();
        List<String> stringLinkedList = new LinkedList<>();

        System.out.println("ADD 1000");
        long start1 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++){
            int add = (int) Math.random() * 100;
            integerArrayList.add(add);
        }
        long finish1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++){
            int add = (int) Math.random() * 100;
            integerLinkedList.add(add);
        }
        long finish2 = System.currentTimeMillis();

        long start3 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++){
            stringArrayList.add("timer");
        }
        long finish3 = System.currentTimeMillis();

        long start4 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++){
            stringLinkedList.add("timer");
        }
        long finish4 = System.currentTimeMillis();

        System.out.println(finish1 - start1);
        System.out.println(finish2 - start2);
        System.out.println(finish3 - start3);
        System.out.println(finish4 - start4);

        System.out.println("ADD 10 000");

        long start5 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            int add = (int) Math.random() * 100;
            integerArrayList.add(add);
        }
        long finish5 = System.currentTimeMillis();

        long start6 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            int add = (int) Math.random() * 100;
            integerLinkedList.add(add);
        }
        long finish6 = System.currentTimeMillis();

        long start7 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            stringArrayList.add("timer");
        }
        long finish7 = System.currentTimeMillis();

        long start8 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            stringLinkedList.add("timer");
        }
        long finish8 = System.currentTimeMillis();

        System.out.println(finish5 - start5);
        System.out.println(finish6 - start6);
        System.out.println(finish7 - start7);
        System.out.println(finish8 - start8);

        System.out.println("SET 1000");

        long start9 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++){
            int add = (int) Math.random() * 100;
            integerArrayList.set(add, add);
        }
        long finish9 = System.currentTimeMillis();

        long start10 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++){
            int add = (int) Math.random() * 100;
            integerLinkedList.set(add, add);
        }
        long finish10 = System.currentTimeMillis();

        long start11 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++){
            int add = (int) Math.random() * 100;
            stringArrayList.set(add, "timer");
        }
        long finish11 = System.currentTimeMillis();

        long start12 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++){
            int add = (int) Math.random() * 100;
            stringLinkedList.set(add, "timer");
        }
        long finish12 = System.currentTimeMillis();

        System.out.println(finish9 - start9);
        System.out.println(finish10 - start10);
        System.out.println(finish11 - start11);
        System.out.println(finish12 - start12);

        System.out.println("SET 10 000");

        long start13 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            int add = (int) Math.random() * 100;
            integerArrayList.set(add, add);
        }
        long finish13 = System.currentTimeMillis();

        long start14 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            int add = (int) Math.random() * 100;
            integerLinkedList.set(add, add);
        }
        long finish14 = System.currentTimeMillis();

        long start15 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            int add = (int) Math.random() * 100;
            stringArrayList.set(add, "timer");
        }
        long finish15 = System.currentTimeMillis();

        long start16 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            int add = (int) Math.random() * 100;
            stringLinkedList.set(add, "timer");
        }
        long finish16 = System.currentTimeMillis();

        System.out.println(finish13 - start13);
        System.out.println(finish14 - start14);
        System.out.println(finish15 - start15);
        System.out.println(finish16 - start16);

        System.out.println("GET 1000");

        long start17 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++){
            int add = (int) Math.random() * 100;
            integerArrayList.get(add);
        }
        long finish17 = System.currentTimeMillis();

        long start18 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++){
            int add = (int) Math.random() * 100;
            integerLinkedList.get(add);
        }
        long finish18 = System.currentTimeMillis();

        long start19 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++){
            int add = (int) Math.random() * 100;
            stringArrayList.get(add);
        }
        long finish19 = System.currentTimeMillis();

        long start20 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++){
            int add = (int) Math.random() * 100;
            stringLinkedList.get(add);
        }
        long finish20 = System.currentTimeMillis();

        System.out.println(finish17 - start17);
        System.out.println(finish18 - start18);
        System.out.println(finish19 - start19);
        System.out.println(finish20 - start20);

        System.out.println("GET 10 000");

        long start21 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            int add = (int) Math.random() * 100;
            integerArrayList.get(add);
        }
        long finish21 = System.currentTimeMillis();

        long start22 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            int add = (int) Math.random() * 100;
            integerLinkedList.get(add);
        }
        long finish22 = System.currentTimeMillis();

        long start23 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            int add = (int) Math.random() * 100;
            stringArrayList.get(add);
        }
        long finish23 = System.currentTimeMillis();

        long start24 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            int add = (int) Math.random() * 100;
            stringLinkedList.get(add);
        }
        long finish24 = System.currentTimeMillis();

        System.out.println(finish21 - start21);
        System.out.println(finish22 - start22);
        System.out.println(finish23 - start23);
        System.out.println(finish24 - start24);

        System.out.println("REMOVE 1000");

        long start25 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++){
            int add = (int) Math.random() * 100;
            integerArrayList.remove(add);
        }
        long finish25 = System.currentTimeMillis();

        long start26 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++){
            int add = (int) Math.random() * 100;
            integerLinkedList.remove(add);
        }
        long finish26 = System.currentTimeMillis();

        long start27 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++){
            int add = (int) Math.random() * 100;
            stringArrayList.remove(add);
        }
        long finish27 = System.currentTimeMillis();

        long start28 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++){
            int add = (int) Math.random() * 100;
            stringLinkedList.remove(add);
        }
        long finish28 = System.currentTimeMillis();

        System.out.println(finish25 - start25);
        System.out.println(finish26 - start26);
        System.out.println(finish27 - start27);
        System.out.println(finish28 - start28);

        System.out.println("REMOVE 10 000");

        long start29 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            int add = (int) Math.random() * 100;
            integerArrayList.remove(add);
        }
        long finish29 = System.currentTimeMillis();

        long start30 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            int add = (int) Math.random() * 100;
            integerLinkedList.remove(add);
        }
        long finish30 = System.currentTimeMillis();

        long start31 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            int add = (int) Math.random() * 100;
            stringArrayList.remove(add);
        }
        long finish31 = System.currentTimeMillis();

        long start32 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            int add = (int) Math.random() * 100;
            stringLinkedList.remove(add);
        }
        long finish32 = System.currentTimeMillis();

        System.out.println(finish29 - start29);
        System.out.println(finish30 - start30);
        System.out.println(finish31 - start31);
        System.out.println(finish32 - start32);

    }
}
