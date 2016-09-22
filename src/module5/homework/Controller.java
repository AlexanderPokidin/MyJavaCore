package module5.homework;

import java.util.Arrays;

public class Controller {
    private API apis[] = new API[3];
    private DAOImpl dao = new DAOImpl();

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        apis[0] = bookingComAPI;

        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        apis[1] = tripAdvisorAPI;

        GoogleAPI googleAPI = new GoogleAPI();
        apis[2] = googleAPI;
    }

    Room[] requstRooms(int price, int persons, String name, String hotel) {

        Room temp = new Room(0, price, persons, null, name, hotel);
        Room[] requstRooms = new Room[25];
        for (int i = 0; i < apis.length; i++){
            if (temp.equals(apis[i]));
            requstRooms[i] = temp;
        }
        dao.saved(temp);
        return requstRooms;
    }

    Room[] check(API api1, API api2) {
        Room[] result1 = api1.findRooms(0, 0, null, null);
        Room[] result2 = api2.findRooms(0, 0, null, null);
        int counter = 0;
            if (result1.equals(result2)) {
                counter++;
        }
        System.out.println(counter);
        return null;
    }

    Room save(Room room) {
        DAOImpl dao = new DAOImpl();
        return dao.saved(room);
    }

}
