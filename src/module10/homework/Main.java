package module10.homework;

import sn.User;

public class Main {
    public static void main(String[] args) throws MyException {
        String str = null;

        //Task1
        try {
            str.toUpperCase();
        } catch (NullPointerException e){
            System.out.println("String is null");
        } finally {
            System.out.println("Method is done");
        }
        System.out.println("----------");

        //Task2
        String message = "I`m string";

        try {
            if (message.length() < 5) {
                System.out.println(message.toUpperCase());
            } else {
                throw new MyException(message);
            }
        } catch (MyException e) {
            System.out.println("MyException is caught");
        }
        System.out.println("----------");

        //Task3
        User user = null;
        try {
            user.getAge();
        } catch (NullPointerException e1) {
            System.out.println("User is empty");
        }
        System.out.println("----------");

        //Task4
        ExceptionTask4 e = new ExceptionTask4();
        e.f();
        System.out.println("----------");

        //Task5
        ExceptionTask4 c = new ExceptionTask4();
        try {
            c.h();
        } catch (Exception e1) {
            System.out.println("All Exceptions was catch");
        }
    }
}
