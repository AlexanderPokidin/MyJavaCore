package module5.homework;

import javax.xml.crypto.Data;
import java.util.Date;

public class BookingComAPI implements API {

    Room[] rooms = new Room[5];
    Data data;

    public BookingComAPI() {
        Room room1 = new Room(2569, 255, 2, data, "Redisson","London");
        Room room2 = new Room(4587, 155, 3, data, "Hilton","Paris");
        Room room3 = new Room(5612, 200, 1, data, "Redisson","Bohn");
        Room room4 = new Room(3551, 750, 5, data, "Park Inn","London");
        Room room5 = new Room(6985, 505, 2, data, "Hayatt","Sidney");
    }





    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }


}
