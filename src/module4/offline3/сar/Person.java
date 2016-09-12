package module4.offline3.сar;

public abstract class Person {
    private Car car;

    public Person(Car car) {
        this.car = car;
    }

    abstract void runDistance(int distance);

    public Car getCar() {
        return car;
    }
}
