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

    public void h(){
        try {
            throw new ExceptionClass1("e1");
        } catch (ExceptionClass1 e1){
            try {
                throw new ExceptionClass2("e2");
            } catch (ExceptionClass2 e2) {
                try {
                    throw new ExceptionClass3("e3");
                } catch (ExceptionClass3 e3){
                    System.out.println("Exception Class 3 was catch");
                }
            }
        }
    }
}
