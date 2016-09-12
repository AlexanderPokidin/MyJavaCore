package module4.offline3.сar;

public class Man extends Person {
    public Man(Car car) {
        super(car);
    }

    @Override
    public void runDistance(int distance) {
        if (distance < 50) {
            System.out.println("For " + distance + " I can run : " + RunTimes.BY_FOOT);
        }
        if (distance >= 50 && distance < 1500) {
            System.out.println("For " + distance + " I can run : " + RunTimes.BY_CAR);
            System.out.println("Fuel spent : " + getCar().fuelNeeds());
        }
        if (distance >= 1500) {
            System.out.println("For " + distance + " I can run : " + RunTimes.BY_PLANE);
        }
    }

}
