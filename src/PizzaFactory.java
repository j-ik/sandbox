/**
 * Created by jounikauremaa on 23/06/2017.
 */
public interface PizzaFactory <P extends Pizza> {
    P build(Pizza.PizzaType type);
}
