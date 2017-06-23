


public class Main {

    public static void main(String[] args) {

        PizzaFactory<Pizza> factory = pt -> new Pizza(pt);
        Pizza pizza = factory.build(Pizza.PizzaType.BOLOGNESE);
        System.out.println(pizza.type);

        PizzaFactory factory2 = Pizza::new;
        pizza = factory2.build(Pizza.PizzaType.FRUTTI_DI_MARE);
        System.out.println(pizza.type);

        /*
        List<Person> roster = new ArrayList<>();
        roster.add(Person.newPerson("John"));
        roster.add(Person.newPerson("Sally"));
        roster.add(Person.newPerson("Julia"));
        //Person.initialize(100);
        roster.add(Person.newPerson("Mike"));
        roster.stream().forEach(Person::printId);
        roster.stream().forEach(System.out::println);
        System.out.println("maxId: " + roster.stream()
            .mapToInt(Person::getId)
            .max()
            .getAsInt());

        System.out.println("avAge: " + roster.stream()
            .mapToInt(Person::getAge)
            .average()
            .getAsDouble());

        /*
        TestThread t1 = new TestThread(1);
        TestThread t2 = new TestThread(2);
        TestThread t3 = new TestThread(3);

        while (t1.isAlive() || t2.isAlive() || t3.isAlive()) {
            System.out.println("Pääsäie käynnissä");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Lopetetaan pääohjelma, kaikki säikeet kuolleet");
        */

    }
}
