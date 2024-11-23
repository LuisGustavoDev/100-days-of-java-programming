package trycatch;

import javax.swing.JOptionPane;

public class App1 {
    public static void main(String[] args) {

        Math math = new Math();
        int[] numbers = new int[] {10, 20, 30, 100}; // 0 1 2 3
        int[] numbers2 = new int[] {2, 0, 4}; // 0 1 2

        // Exception -> ArithmeticException, ArrayIndex...

        for(int index = 0; index < 4; index++) {
            try {
                math.divide(numbers[index], numbers2[index]);
                System.out.println("Phrase after exception");
            } catch (ArithmeticException error) {
                // Handles arithmetic errors, related to mathematical calculations
                System.out.println("Calculation error: " + error.getMessage());
                JOptionPane.showMessageDialog(null, "Calculation error" + error.getMessage());
            } catch (ArrayIndexOutOfBoundsException error) {
                // Handles errors related to exceeding the size of the array
                System.out.println("Array error: " + error.getMessage());
            } catch(Exception error) {
                System.out.println("Generic error"); // Specialist first, Generalist last
            } 
        }
        System.out.println("Final message:");
    }
}
