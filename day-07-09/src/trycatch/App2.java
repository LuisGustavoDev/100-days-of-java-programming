package trycatch;

public class App2 {
    public static void main(String[] args) {
        try {
            System.out.println("Message before exception");
            int result = 10 / 0;
            System.out.println("Message after exception");
        } catch (Exception error) {
            System.out.println("Error: " + error.getMessage());
        } finally {
            // Will always be executed
            System.out.println("I will be executed regardless of whether an error occurred or not");

        }
        System.out.println("Final message");
    }
}
