public class HelloApp {
    public static void main(String[] args) {

        // Check for no arguments
        if (args.length == 0) {
            System.out.println("Hello, Guest!");
            return;
        }

        // Use StringBuilder for efficient string construction
        StringBuilder names = new StringBuilder();

        // Iterate using enhanced for-loop
        for (String name : args) {
            if (names.length() > 0) {
                names.append(", "); // add delimiter only after first element
            }
            names.append(name);
        }

        // Single greeting with all names
        System.out.println("Hello, " + names.toString() + "!");
    }
}