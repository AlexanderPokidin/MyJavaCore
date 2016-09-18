package module5.homework;

import javax.xml.crypto.Data;

public class TripAdvisorAPI implements API {
    Room[] rooms = new Room[5];
    Data data;

    public TripAdvisorAPI() {
        Room room11 = new Room(8695, 255, 3, data, "Redisson", "Munich");
        Room room12 = new Room(3256, 155, 4, data, "Hilton", "Paris");
        Room room13 = new Room(1142, 210, 1, data, "Redisson", "Paris");
        Room room14 = new Room(5612, 200, 1, data, "Redisson","Bohn");
        Room room15 = new Room(6548, 548, 4, data, "President", "Chicago");
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
