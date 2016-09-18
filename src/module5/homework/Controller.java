package module5.homework;

public class Controller {
    private API apis[] = new API[3];
    DAOImpl dao = new DAOImpl();

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
        return null;
    }

    Room save(Room room) {
        DAOImpl dao = new DAOImpl();
        return dao.saved(room);
    }

}
