package module6.onlinepractice;

public class Item {
    private long id;
    private String name;
    private String cityStored;

    private int price;

    public Item() {
    }

    public Item(long id, String name, String cityStored, int price) {
        this.id = id;
        this.name = name;
        this.cityStored = cityStored;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (id != item.id) return false;
        if (price != item.price) return false;
        if (!name.equals(item.name)) return false;
        return cityStored.equals(item.cityStored);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + name.hashCode();
        result = 31 * result + cityStored.hashCode();
        result = 31 * result + price;
        return result;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCityStored() {
        return cityStored;
    }

    public int getPrice() {
        return price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCityStored(String cityStored) {
        this.cityStored = cityStored;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
