public class HelloApp {
    public static void main(String[] args) {

        // Check if arguments are provided
        String name = (args.length > 0) ? args[0] : "Guest";

        // Print the greeting
        System.out.println("Hello, " + name + "!");
    }
}