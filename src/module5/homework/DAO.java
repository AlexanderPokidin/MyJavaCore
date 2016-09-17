package module5.homework;

public interface DAO {
    Room saved(Room room);
    boolean deleted(Room room);
    Room updste(Room room);
    Room findByld(long id);
}
