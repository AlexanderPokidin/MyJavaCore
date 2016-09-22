package module5.homework;

import javax.xml.crypto.Data;
import java.util.Date;

public class BookingComAPI implements API {

    private Room[] rooms = new Room[5];
    private Data data;

    public BookingComAPI() {
        Room room1 = new Room(2569, 255, 2, data, "Redisson","London");
        Room room2 = new Room(4587, 155, 3, data, "Hilton","Paris");
        Room room3 = new Room(5612, 200, 1, data, "Redisson","Bohn");
        Room room4 = new Room(3551, 750, 5, data, "Park Inn","London");
        Room room5 = new Room(6985, 505, 2, data, "Hayatt","Sidney");
        //Room room6 = new Room(5612, 200, 1, data, "Redisson","Bohn");
        //Room room7 = new Room(5612, 200, 1, data, "Redisson","Bohn");


    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room temp = new Room(0, price, persons, null, city, hotel);
        Room[] foundRooms = new Room[5];
        for (int i = 0; i < rooms.length; i++){
            if (temp.equals(rooms[i])) {
                if (temp.getHotelName().equals(rooms[i].getHotelName()));
                foundRooms[i] = temp;
            }
        }
        return foundRooms;
    }
}
