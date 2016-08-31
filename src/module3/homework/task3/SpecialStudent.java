package module3.homework.task3;

public class SpecialStudent extends CollegeStudent{
    long secretKey;
    String email;

        public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String collegeName, int rating, long id) {
        super(collegeName, rating, id);
    }

    public SpecialStudent(long secretKey) {
        this.secretKey = secretKey;
    }
}
