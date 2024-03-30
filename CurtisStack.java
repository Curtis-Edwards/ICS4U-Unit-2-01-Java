/*
 * The CurtisStack Class.
 *
 * @author  Curtis Edwards
 * @version 1.0
 * @since   2024-03-27
 */

import java.util.ArrayList;
import java.util.List;

/**
 * The CurtisStack class.
 */
public class CurtisStack {
    /**
     * Declares a private instance variable.
     */
    //private List<String> stackAsList;

    /**
     * The constructor.
     */
    public CurtisStack() {
        stackAsList = new ArrayList<>();
    }

    /**
     * The push method.
     *
     * @param input from Main.java
     */
    public void push(String input) {
        stackAsList.add(input);
    }

    /**
     * The showStack method.
     *
     * @return the values as a string
     */
    public String showStack() {
        String values = "";
        for (int counter = 0; counter < stackAsList.size(); counter++) {
            values += stackAsList.get(counter);
            if (counter < stackAsList.size() - 1) {
                values += ", ";
            }
        }
    return values;
    }
}
