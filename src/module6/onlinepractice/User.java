package module6.onlinepractice;

public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String city;

    public User(long id, String firstName, String lastName, String city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (!firstName.equals(user.firstName)) return false;
        if (!lastName.equals(user.lastName)) return false;
        return city.equals(user.city);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + city.hashCode();
        return result;
    }
}
