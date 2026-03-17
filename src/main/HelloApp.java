public class HelloApp {
    public static void main(String[] args) {

        String greeting;

        // Check if arguments are provided
        if (args.length > 0) {

            // Optional: loop through args (as required)
            for (int i = 0; i < args.length; i++) {
                // You could process/validate each name here if needed
                // For now, we just iterate as per requirement
            }

            // Join all names into one string
            String names = String.join(" ", args);

            greeting = "Hello, " + names + "!";
        } else {
            greeting = "Hello, Guest!";
        }

        // Print single greeting
        System.out.println(greeting);
    }
}