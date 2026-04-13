public class HelloApp {
    public static void main(String[] args) {
        // Check if no arguments are passed
        if (args.length == 0) {
            System.out.println("Hello, Guest!");
        
            return;
        }

        // Use StringBuilder to build names
        StringBuilder nameBuilder = new StringBuilder();

        // Iterate through all arguments
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove last ", " safely
        if (nameBuilder.length() > 0) {
            nameBuilder = new StringBuilder(
                nameBuilder.substring(0, nameBuilder.length() - 2)
            );
        }

        // Print final greeting
        System.out.println("Hello, " + nameBuilder + "!");
    }
}