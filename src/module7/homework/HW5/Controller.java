package module7.homework.HW5;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<API> apis = new ArrayList<>();
    private DAOImpl dao = new DAOImpl();

    public Controller(){
        BookingComAPI bookingComAPI = new BookingComAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        GoogleAPI googleAPI = new GoogleAPI();

        apis.add(bookingComAPI);
        apis.add(tripAdvisorAPI);
        apis.add(googleAPI);
    }

    List<Room> requstRooms(int price, int person, String city, String hotel){
        Room temp = new Room(0, price, person, null, city, hotel);
        List<Room> requstRooms = new ArrayList<>();
        for (API item : apis) {
            if (item.equals(temp));
            requstRooms.add(temp);

        }
        dao.save(temp);
        return requstRooms;
    }
}
