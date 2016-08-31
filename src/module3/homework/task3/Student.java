package module3.homework.task3;

public class Student {
    String firstName;
    String lastName;
    int group;
<<<<<<< HEAD
    Course[] coursesTaken;
    int age;

    public Student() {
    }

=======
    Course[] corsesTaken;
    int age;

>>>>>>> origin/master
    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

<<<<<<< HEAD
    public Student(String lastName, Course[] coursesTaken) {
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
=======
    public Student(String lastName, Course[] corsesTaken) {
        this.lastName = lastName;
        this.corsesTaken = corsesTaken;
>>>>>>> origin/master
    }
}
