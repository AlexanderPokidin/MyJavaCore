package module9.homework;

import module7.homework.*;

import java.util.*;
import java.util.stream.Collectors;

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

    public static Map<String, List<Order>> separateCity(List<Order> orders) {
        Map<String, List<Order>> foundCityOrders = orders.stream().collect(Collectors.groupingBy(o -> o.getUser().getCity()));
        return foundCityOrders;
    }

}
