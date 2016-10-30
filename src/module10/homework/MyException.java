package module10.homework;

public class MyException extends Exception{

    private String message = "My first Exception";

    public MyException(String message) {
        super(message);
    }
}
