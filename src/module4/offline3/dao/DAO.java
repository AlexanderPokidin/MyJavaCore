package module4.offline3.dao;

public interface DAO {
    Object save(Object user);

    Object update(Object user);

    Object delete (Object user);

    Object find(long id);
}
