package module6.offline5;

public class ArrayUtils {

    static Order[] check(Order[] ar1, Order[] ar2) {

        int count = 0;
        for (Order order1 : ar1) {
            for (Order order2 : ar2) {
                if (order1.equals(order2)) count++;
            }
        }
        Order[] res = new Order[count];

        int index = 0;
        for (Order order1 : ar1) {
            for (Order order2 : ar2) {
                if (order1.equals(order2)) {
                    res[index] = order1;
                    index++;
                }
            }
        }
        return res;
    }
    static Order[] unique(Order[] orders) {
        return null;
    }
    static Order[] deleteEmpty(Order[] orders) {
        return null;
    }



    static Order getActive(Order[] orders) {
        Order[] ordersActive = new Order[orders.length];
        int index = 0;
        for (Order order : ordersActive) {
            if (order.isActive() && order.isDone())
                ordersActive[index++] = order;
        }
        return deleteEmpty(orders);
    }
}