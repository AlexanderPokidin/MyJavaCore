package module5.homework;

import javax.xml.crypto.Data;

public class TripAdvisorAPI implements API {
    Room[] rooms = new Room[5];
    Data data;

    public TripAdvisorAPI() {
        Room room11 = new Room(8695, 255, 3, data, "Redisson","Munich");
        Room room12 = new Room(3256, 155, 4, data, "Hilton","Paris");
        Room room13 = new Room(1142, 210, 1, data, "Redisson","Paris");
        Room room14 = new Room(3875, 750, 7, data, "Park Inn","Moscow");
        Room room15 = new Room(6548, 548, 4, data, "President","Chicago");
    }


    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
