import java.util.Random;

/**
 * Created by jounikauremaa on 23/06/2017.
 */
public class Person {

    private int age;
    private String name;
    private int id;
    private static final int PERSON_MAX_ID = 1000;
    private static final int PERSON_MAX_AGE = 100;
    private static int personID = 0;
    private static Random rand = new Random();

    private Person (int age, String name, int id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    @Deprecated
    public static void initialize(int seed) {}

    @Deprecated
    public static Person newPerson(int age, String name) {
        return new Person(age, name, rand.nextInt(PERSON_MAX_ID));
    }

    public static Person newPerson(String name) {
        return new Person(rand.nextInt(PERSON_MAX_AGE), name, ++personID);
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
