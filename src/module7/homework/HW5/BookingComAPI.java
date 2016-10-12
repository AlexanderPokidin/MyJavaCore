package module7.homework.HW5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingComAPI implements API{
    private List<Room> rooms = new ArrayList<>();
    private Date data;

    public BookingComAPI() {
        Room room1 = new Room(2569, 255, 2, data, "Redisson","London");
        Room room2 = new Room(4587, 155, 3, data, "Hilton","Paris");
        Room room3 = new Room(5612, 200, 1, data, "Redisson","Bohn");
        Room room4 = new Room(3551, 750, 5, data, "Park Inn","London");
        Room room5 = new Room(6985, 505, 2, data, "Hayatt","Sidney");

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);
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
