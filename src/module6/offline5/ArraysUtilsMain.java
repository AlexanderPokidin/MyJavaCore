package module6.offline5;

public class ArraysUtilsMain {
    public static void main(String[] args) {
        Order order1 = new Order(100, "bycacle", true, false, 1001);
        Order order2 = new Order(100, "phone", true, false, 1001);
        //Order order3 = new Order(100, "bycacle", true, false, 1001);

        Order[] ar1 = {order1};
        Order[] ar2 = {order2, order1, order1};

        System.out.println((ArrayUtils.check(ar1, ar2).length));

    }
}
