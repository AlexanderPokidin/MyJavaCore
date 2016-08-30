package module3.homework.task3;

public class Student {
    String firstName;
    String lastName;
    int group;
    Course[] corsesTaken;
    int age;

    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Student(String lastName, Course[] corsesTaken) {
        this.lastName = lastName;
        this.corsesTaken = corsesTaken;
    }
}
