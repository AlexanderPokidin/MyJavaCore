package module9.homework;

import module7.homework.*;

import java.util.*;

public class OrderUtils {

    public static List<List<Order>> separateCurrensy(List<Order> orders) {
        List<List<Order>> foundCurOrders = new ArrayList<>();
        List<Order> orderUsd = new ArrayList<>();
        List<Order> orderUah = new ArrayList<>();

        orders.stream().filter(order -> order.getCurrency() == module7.homework.Currency.USD)
                .forEach(orderUsd::add);
        orders.stream().filter(order -> order.getCurrency() == module7.homework.Currency.UAH)
                .forEach(orderUah::add);
        foundCurOrders.add(orderUsd);
        foundCurOrders.add(orderUah);
        return foundCurOrders;
    }

}
