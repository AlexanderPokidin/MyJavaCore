package module5.homework;

import javax.xml.crypto.Data;

public class Room {
    private long id;
    private int price;
    private int persons;
    private Data dataAvailableFrom;
    private String hotelName;
    private String cityName;

    public Room(long id, int price, int persons, Data dataAvailableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dataAvailableFrom = dataAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (id != room.id) return false;
        if (price != room.price) return false;
        if (persons != room.persons) return false;
        if (dataAvailableFrom != null ? !dataAvailableFrom.equals(room.dataAvailableFrom) : room.dataAvailableFrom != null)
            return false;
        if (hotelName != null ? !hotelName.equals(room.hotelName) : room.hotelName != null) return false;
        return cityName != null ? cityName.equals(room.cityName) : room.cityName == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + price;
        result = 31 * result + persons;
        result = 31 * result + (dataAvailableFrom != null ? dataAvailableFrom.hashCode() : 0);
        result = 31 * result + (hotelName != null ? hotelName.hashCode() : 0);
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        return result;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public Data getDataAvailableFrom() {
        return dataAvailableFrom;
    }

    public void setDataAvailableFrom(Data dataAvailableFrom) {
        this.dataAvailableFrom = dataAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
