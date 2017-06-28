import java.util.ArrayList;
import java.util.List;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {
    
        PersonFactory<Plumber> plumberFactory = Plumber::new;
        PersonFactory<BankTeller> bankTellerPersonFactory = BankTeller::new;
        Plumber p1 = plumberFactory.create("Pekka");
        p1.addTool(Tool.HAMMER);
        System.out.println(p1.getTool(1));
        p1.addTool(Tool.HAMMER);
        System.out.println(p1.getTool(1));
        p1.addTool(Tool.SAW);
        System.out.println(p1.getTool(1));
        BankTeller b1 = bankTellerPersonFactory.create("Anja");
        b1.setBranchName("Aleksanterinkatu Helsinki");
        b1.setBranchName("Aleksanterinkatu Porvoo");
        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(b1);
        persons.stream().forEach(System.out::println);
        System.out.println(p1.toString());
    }
}
