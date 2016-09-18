package module5.homework;

public interface DAO {
    Room saved(Room room);
    boolean deleted(Room room);
    Room update(Room room);
    Room findByld(long id);
}
