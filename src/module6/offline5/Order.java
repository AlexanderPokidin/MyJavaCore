package module6.offline5;

public class Order {
    private long id;
    private String itemNames;
    private boolean isActive;
    private boolean isDone;
    private int price;

    private User user;

    public Order(long id, String itemNames, boolean isActive, boolean isDone, int price) {
        this.id = id;
        this.itemNames = itemNames;
        this.isActive = isActive;
        this.isDone = isDone;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        if (isActive != order.isActive) return false;
        if (isDone != order.isDone) return false;
        if (price != order.price) return false;
        if (!itemNames.equals(order.itemNames)) return false;
        return user.equals(order.user);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + itemNames.hashCode();
        result = 31 * result + (isActive ? 1 : 0);
        result = 31 * result + (isDone ? 1 : 0);
        result = 31 * result + price;
        result = 31 * result + user.hashCode();
        return result;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isDone() {
        return isDone;
    }

    public long getId() {
        return id;
    }
}
