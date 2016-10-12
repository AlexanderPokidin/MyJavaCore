package module7.homework.HW5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TripAdvisorAPI implements API{
    private List<Room> rooms = new ArrayList<>();
    private Date data;

    public TripAdvisorAPI() {
        Room room11 = new Room(8695, 255, 3, data, "Redisson", "Munich");
        Room room12 = new Room(3256, 155, 4, data, "Hilton", "Paris");
        Room room13 = new Room(1142, 210, 1, data, "Redisson", "Paris");
        Room room14 = new Room(5612, 200, 1, data, "Redisson","Bohn");
        Room room15 = new Room(6548, 548, 4, data, "President", "Chicago");

        rooms.add(room11);
        rooms.add(room12);
        rooms.add(room13);
        rooms.add(room14);
        rooms.add(room15);
    }

    @Override
    public List<Room> findRooms(int price, int person, String city, String hotel) {
        Room temp = new Room(0, price, person, null, city, hotel);
        List<Room> foundRooms = new ArrayList<>();
        for (Room item : rooms) {
            if (item.equals(temp)){
                if (item.getHotelName().equals(temp.getHotelName()));
                foundRooms.add(item);
            }
        }
        return foundRooms;
    }
}
