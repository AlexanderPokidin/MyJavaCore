package module3.homework.task3;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Date date = new Date();

        Course chemistry = new Course(date, "John");
        Course physics = new Course(date, "Garry");
        Course mathematics = new Course(date, "Tommy");
        Course history = new Course(date, "Bruno");
        Course geography = new Course(date, "Maria");

        Course courses[] = {chemistry, mathematics, physics, geography, history};

        Student vasya = new Student("Vasya", "Popov", 2);
        Student vova = new Student("Baranov", courses);

        CollegeStudent inna = new CollegeStudent("Inna", "Kozlova", 3);
        CollegeStudent nina = new CollegeStudent("Papina", courses);
        CollegeStudent ira = new CollegeStudent("KPI", 54, 425875625);

        SpecialStudent damir = new SpecialStudent("Damir", "Oboev", 1);
        SpecialStudent vahtang = new SpecialStudent("KPI", 47, 52487569);
        SpecialStudent marat = new SpecialStudent(504875);
    }
}
