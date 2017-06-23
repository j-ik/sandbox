import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by jounikauremaa on 23/06/2017.
 */
public abstract class Person {

    private int age;
    private String name;
    private int id;
    private static final int PERSON_MAX_AGE = 100;
    private static int person = 0;
    private static Map<Integer, Person> persons = new HashMap<>();
    private static Random rand = new Random();

    public Person (String name) {
        this.name = name;
        this.age = rand.nextInt(PERSON_MAX_AGE);
        this.id = ++person;
        persons.put(id, this);
    }

    public Person getPerson(int id) {
        return persons.get(id);
    }

    public void printId() {
        System.out.println(id);
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ": " + age + " [" + id + "]";
    }

}
