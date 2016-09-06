package module4.offline3.dao;

public abstract class AbstractDAO {

    public Object save(Object objact) {
        System.out.println(objact.toString() + " saved");
        return objact;
    }

    public Object update(Object objact) {
        System.out.println(objact.toString() + " updated");
        return objact;
    }

    public Object delete(Object objact) {
        System.out.println(objact.toString() + " deleted");
        return true;
    }

    public Object find(long id) {
        Task task = new Task("Calculate min/max...");
        task.setId(id);
        return task;
    }
}
