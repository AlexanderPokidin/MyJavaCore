package module7.homework;

import java.util.*;

public class OrderUtils {

    public static Comparator<Order> DecreaseOrder = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            return o2.getPrice() - o1.getPrice();
        }
    };

    public static Comparator<Order> IncreaseOrder = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            if ((o1.getPrice() - o2.getPrice()) == 0) {
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
            return o1.getPrice() - o2.getPrice();
        }
    };

    public static Comparator<Order> ItemShopCity = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            if ((o1.getItemName().compareTo(o2.getItemName())) == 0) {
                if ((o1.getShopIdentificator().compareTo(o2.getShopIdentificator())) == 0) {
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                }
                return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            }
            return o1.getItemName().compareTo(o2.getItemName());
        }
    };

    public static Set<Order> delDuplicate (List<Order> orders) {
        Set<Order> orderSet = new HashSet<>();
        orderSet.addAll(orders);
        return orderSet;
    }



    public static List<Order> morePrice (List<Order> orders) {
        for (int i = orders.size()-1; i >= 0; i--) {
            if (orders.get(i).getPrice() < 1500) {
                orders.remove(i);
            }
        }
        return orders;
    }

    public static List<Order> ordersCurrency (List<Order> orders, Currency currency) {
        List<Order> foundCurOrders = new ArrayList<>();
        for (Order item : orders) {
            if (item.getCurrency().equals(currency)) {
                foundCurOrders.add(item);
            }
        }
        return foundCurOrders;
    }

}
