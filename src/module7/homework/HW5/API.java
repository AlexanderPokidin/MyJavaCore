package module7.homework.HW5;

import java.util.List;

public interface API {
    List<Room> findRooms(int price, int person, String city, String hotel);
}
