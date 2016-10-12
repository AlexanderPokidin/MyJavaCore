package module7.homework.HW5;

public class DAOImpl implements DAO{

    @Override
    public Room save(Room room) {
        System.out.println(room.toString() + " saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room.toString() + " deleted");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room.toString() + " updated");
        return room;
    }

    @Override
    public Room findById(long id) {
        System.out.println(id + " found");
        return null;
    }
}
