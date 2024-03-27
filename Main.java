/*
* This is the standard Main.java starting point.
*
* @author  Curtis Edwards
* @version 1.0
* @since   2024-03-27
*/

/**
* This is the Main program.
*/
final class Main {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException if instantiation is attempted
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The main() function.
    *
    * @param String[] args
    */
    public class main {
        public static void main(String[] args) {
            CurtisStack<String> fruits = new CurtisStack<>();
            fruits.push("apple");
            fruits.push("banana");
            fruits.push("cherry");
            System.out.println("fruits: " + fruits.showStack());
    
            CurtisStack<String> colours = new CurtisStack<>();
            colours.push("red");
            colours.push("green");
            colours.push("blue");
            System.out.println("colours: " + colours.showStack());
    
            CurtisStack<String> shapes = new CurtisStack<>();
            shapes.push("square");
            shapes.push("triangle");
            shapes.push("circle");
            System.out.println("shapes: " + shapes.showStack());
    
            System.out.println("\nDone.");
        }
    }
