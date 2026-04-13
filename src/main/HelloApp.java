public class HelloApp {
    public static void main(String[] args) {

        // Check for missing arguments
        if (args.length == 0) {
            System.out.println("Hello, Guest!");
            return;
        }

        // String.join handles delimiter automatically
        String names = String.join(", ", args);

        // Print greeting
        System.out.println("Hello, " + names + "!");
    }
}