public class Main {
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
