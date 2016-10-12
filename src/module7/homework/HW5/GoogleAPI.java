package module7.homework.HW5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoogleAPI implements API{
    private List<Room> rooms = new ArrayList<>();
    private Date data;

    public GoogleAPI() {
        Room room21 = new Room(5612, 200, 1, data, "Redisson","Bohn");
        Room room22 = new Room(3562, 805, 7, data, "Hilton","Paris");
        Room room23 = new Room(4587, 155, 3, data, "Hilton","Paris");
        Room room24 = new Room(1204, 750, 5, data, "Park Inn","Rome");
        Room room25 = new Room(0265, 200, 1, data, "Redisson","Kiev");

        rooms.add(room21);
        rooms.add(room22);
        rooms.add(room23);
        rooms.add(room24);
        rooms.add(room25);
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
