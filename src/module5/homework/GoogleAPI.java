package module5.homework;

import javax.xml.crypto.Data;

public class GoogleAPI implements API {

    Room[] rooms = new Room[5];
    Data data;

    public GoogleAPI() {
        Room room21 = new Room(1458, 115, 2, data, "Park Inn","Ottava");
        Room room22 = new Room(3562, 805, 7, data, "Hilton","Paris");
        Room room23 = new Room(1587, 300, 2, data, "Palase","Berlin");
        Room room24 = new Room(1204, 750, 5, data, "Park Inn","Rome");
        Room room25 = new Room(0265, 548, 4, data, "Ukraine","Kiev");
    }
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
