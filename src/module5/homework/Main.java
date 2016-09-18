package module5.homework;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.requstRooms(200, 1, "Redisson","Bohn");
        controller.requstRooms(210, 1, "Redisson","Paris");
        controller.requstRooms(155, 3, "Hilton", "Paris");


    }



}
