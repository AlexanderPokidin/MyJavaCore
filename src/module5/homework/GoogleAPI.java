package module5.homework;

import javax.xml.crypto.Data;

public class GoogleAPI implements API {

    Room[] rooms = new Room[5];
    Data data;

    public GoogleAPI() {
        Room room21 = new Room(5612, 200, 1, data, "Redisson","Bohn");
        Room room22 = new Room(3562, 805, 7, data, "Hilton","Paris");
        Room room23 = new Room(4587, 155, 3, data, "Hilton","Paris");
        Room room24 = new Room(1204, 750, 5, data, "Park Inn","Rome");
        Room room25 = new Room(0265, 200, 1, data, "Redisson","Kiev");
    }
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room temp = new Room(0, price, persons, null, city, hotel);
        Room[] foundRooms = new Room[5];
        for (int i = 0; i < rooms.length; i++){
            if (temp.equals(rooms[i]));
            foundRooms[i] = temp;
        }
        return new Room[5];
    }
}
