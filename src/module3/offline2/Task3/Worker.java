package module3.offline2.Task3;

public class Worker extends Person {
    private String adress;
    private int salary;

    public Worker(String firstName, String secondName, int age, boolean gender, String adress, int salary) {
        super(firstName, secondName, age, gender);
        this.adress = adress;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
