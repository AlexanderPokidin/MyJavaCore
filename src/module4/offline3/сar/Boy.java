package module4.offline3.сar;

public class Boy extends Man {
    public Boy(Car car) {
        super(car);
    }

    @Override
    public void runDistance(int distance) {
        if (distance < 35) {
            System.out.println("For " + distance + " I can run : " + RunTimes.BY_FOOT);
        }
        if (distance >= 35 && distance < 950) {
            System.out.println("For " + distance + " I can run : " + RunTimes.BY_CAR);
            System.out.println("Fuel spent : " + getCar().fuelNeeds());
        }
        if (distance >= 950) {
            System.out.println("For " + distance + " I can run : " + RunTimes.BY_PLANE);
        }
    }
}
