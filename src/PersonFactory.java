/**
 * Created by jounikauremaa on 23/06/2017.
 */
public interface PersonFactory <P extends Person> {
    P create(String name);
}
