package module6.onlinepractice;

import java.util.Date;

public class Controller {
    private Store store = new Store("Kiev");

    private DAOImpl dao = new DAOImpl();


    public void makeOrder(User user, Item item) {
        Order order = new Order(item, user);

        Item[] items = store.getItems();

        for (Item storeItem : items) {
            if (storeItem.getCityStored().equals(item.getCityStored()) &&
                    storeItem.getName().equals(item.getName())) {
                store.getOrders()[Store.getIndex()] = order;
                dao.save(order);
                return;
            }
            System.out.println("We don`t have this Item");
        }

        store.getOrders() [Store.getIndex()] = order;

        dao.save(order);
    }

    public void shipOrder(User user, Item item) {
        makeOrderOperation(user, item, "ship");
//        Order[] orders = store.getOrders();
//        for (Order storeOrder : orders) {
//            if (storeOrder.getUser().equals(user)
//                    && !storeOrder.isShipped()
//                    && customCheckIfItemEqual(storeOrder, item)) {
//                storeOrder.setShipped(true);}
//            return;
//            //TODO
//        }
//        System.out.println("We don`t have this order");
    }

    public void cancelOrder(User user, Item item) {
        makeOrderOperation(user, item, "inactivate");
//        Order[] orders = store.getOrders();
//        for (Order storeOrder : orders) {
//            if (storeOrder.getUser().equals(user)
//                    && !storeOrder.isShipped()
//                    && customCheckIfItemEqual(storeOrder, item)) {
//                storeOrder.setActive(false);}
//            return;
//            //TODO
//        }
//        System.out.println("We don`t have this order");
    }

    private void makeOrderOperation(User user, Item item, String methodName) {
        Order[] orders = store.getOrders();
        for (Order storeOrder : orders) {
            if (storeOrder.getUser().equals(user)
                    && !storeOrder.isShipped()
                    && customCheckIfItemEqual(storeOrder, item)) {
                switch (methodName)
                {
                    case "ship" :
                        storeOrder.setShipped(true);
                        break;
                    case "inactivete" :
                        storeOrder.setActive(false);
                        break;
                }
            }
            return;
        }
        System.out.println("We don`t have this order");
    }

    private boolean customCheckIfItemEqual(Order storeOrder, Item item2) {
        Item item1 = storeOrder.getItem();
        if (!item1.getName().equals(item2.getName())) return false;
        return (item1.getCityStored().equals(item2.getCityStored()));
    }
}
