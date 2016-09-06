package module4.offline3.dao;

public class Task {
    long id;
    String description;

    public Task(String description) {
        this.description = description;
    }

    public void setId(long id) {
        this.id = id;
    }
}
