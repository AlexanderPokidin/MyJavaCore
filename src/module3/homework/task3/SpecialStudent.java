package module3.homework.task3;

public class SpecialStudent extends CollegeStudent{

    private long secretKey;
    private String email;

        protected SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    protected SpecialStudent(String collegeName, int rating, long id) {
        super(collegeName, rating, id);
    }

    protected SpecialStudent(long secretKey) {
        this.secretKey = secretKey;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
