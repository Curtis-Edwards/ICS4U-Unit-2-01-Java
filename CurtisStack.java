import java.util.ArrayList;
import java.util.List;

/**
* The CurtisStack() class.
*
* @param <T> as the type parameter
*/
public class CurtisStack<T> {
    private List<T> stackAsList;

    /**
    * The constructor().
    */
    public CurtisStack() {
        stackAsList = new ArrayList<>();
    }

    /**
    * The push() method.
    *
    * @param input from Main.java
    */
    public void push(T input) {
        stackAsList.add(input);
    }

    /**
    * The showStack() method.
    *
    * @return the values as a string
    */
    public String showStack() {
        final StringBuilder values = new StringBuilder();
        for (int counter = 0; counter < stackAsList.size(); counter++) {
            values.append(stackAsList.get(counter)).append(", ");
        }
        if (values.length() > 0) {
            values.delete(values.length() - 2, values.length());
        }
        return values.toString();
    }
}

