package module3.homework.task3;

public class CollegeStudent extends Student {
    public CollegeStudent() {
    }

    private String collegeName;
    private int rating;
    private long id;

    protected CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    protected CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    protected CollegeStudent(String collegeName, int rating, long id) {
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

