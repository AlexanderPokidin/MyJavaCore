package module2;


public class LoopsExample {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers){
            System.out.println(x);
            System.out.println(",");
        }
        System.out.println("\n");

        String[] names = {"James", "Larry", "Tom", "Lasy"};
        for (String name : names){
            System.out.println(name);
            System.out.println(",");
        }
        /*for( <initialization> ; <condition> ; <statement> ) {
        <Block of statement>;
        }
        */

        for (int i = 0; i < 10; i++) {
            System.out.println("step " + i);
        }

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        //do while example
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count ++;
        } while (count < 11);

        int n = -10;
        while (n < 0) {
            System.out.println(n);
            n += 3;
        }

        //TODO break and continue statements live
    }
}

