package module10.homework;

import java.util.NoSuchElementException;

public class ExceptionTask4 {
    public void f() {
        try {
            g();
        } catch (NoSuchElementException e) {
            System.out.println("Method f Exception was catch");
        }
    }

    public void g() {
        try {
            throw new MyException("My Exception");
        } catch (MyException e) {
            System.out.println("Method g Exception was catch");
        }
    }
}
