import java.util.ArrayList;
import java.util.List;

public class CurtisStack<String> {
    private List<String> stackAsList;

    public CurtisStack() {
        stackAsList = new ArrayList<>();
    }

    public void push(String input) {
        stackAsList.add(input);
    }

    public String showStack() {
        StringBuilder values = new StringBuilder();
        for (int counter = 0; counter < stackAsList.size(); counter++) {
            values.append(stackAsList.get(counter)).append(", ");
        }
        if (values.length() > 0) {
            values.delete(values.length() - 2, values.length());
        }
        return values.toString();
    }
}
