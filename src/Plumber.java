import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jounikauremaa on 23/06/2017.
 */
public class Plumber extends Person {

    List<Tool> tools;

    public Plumber(String name) {
        super(name);
        tools = new ArrayList<>();
    }

    public int addTool(Tool tool) {
        Integer idx = tools.indexOf(tool);
        if (idx == -1) {
            tools.add(tool);
            idx = tools.size() - 1;
        }
        return idx;
    }

    public Tool getTool(int position) {
        try {
            return tools.get(position);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No such tool position | " + e.getMessage());
        }
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + "| Tools: " + tools.toString();
    }
}
