package module4.offline3.сar;

public class Woman extends Person {
    public Woman(Car car) {
        super(car);
    }

    @Override
    public void runDistance(int distance) {
        if (distance < 10) {
            System.out.println("For " + distance + " I can run : " + RunTimes.BY_FOOT);
        }
        if (distance >= 10 && distance < 500) {
            System.out.println("For " + distance + " I can run : " + RunTimes.BY_CAR);
            System.out.println("Fuel spent : " + getCar().fuelNeeds());
        }
        if (distance >= 500) {
            System.out.println("For " + distance + " I can run : " + RunTimes.BY_PLANE);
        }

    }
}
