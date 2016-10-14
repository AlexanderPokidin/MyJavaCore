package module8.homework;

import java.util.List;

public interface AbstractDAO <T>{
    T save(T t);
    void delete(T t);
    void deleteAll(List<T> tList);
    void saveAll(List<T> tList);
    List<T> getList();


}
