package module4.offline3.сar;

public class Main {
    public static void main(String[] args) {
        Car honda = new Honda();
        Car tesla = new Tesla();

        Person woman = new Woman(honda);
        Person man = new Man(tesla);
        Person boy = new Boy(honda);
        Person girl = new Girl(honda);

        woman.runDistance(400);
        woman.runDistance(2);
        woman.runDistance(1000);

        System.out.println(" ");

        boy.runDistance(400);
        boy.runDistance(2);
        boy.runDistance(1000);


        //man.runDistance(int 500);

        //PersonOld person = Girl();
        //person.runDistance(int 500);

    }
}
