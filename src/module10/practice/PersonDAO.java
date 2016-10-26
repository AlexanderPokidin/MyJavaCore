package module10.practice;

public interface PersonDAO {
    Person save(Person person);
    Person findByEmail(String email);

}
