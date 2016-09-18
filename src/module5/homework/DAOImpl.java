package module5.homework;

public class DAOImpl implements DAO{
    @Override
    public String toString() {
        return "DAOImpl{}";
    }

    @Override
    public Room saved(Room room) {

        System.out.println(room.toString() + " saved");
        return room;
    }

    @Override
    public boolean deleted(Room room) {
        System.out.println(room.toString() + " deleted");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room.toString() + " updated");
        return room;
    }

    @Override
    public Room findByld(long id) {
        System.out.println(id + " found");
        return null;
    }
}
