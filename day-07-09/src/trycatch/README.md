# Try and Catch: Exception Handling in Java

This project demonstrates how to use Java's `try` and `catch` blocks for exception handling. It includes multiple examples of handling specific exceptions like `ArithmeticException` and `ArrayIndexOutOfBoundsException`, as well as a `finally` block that is always executed. The goal is to improve the handling of runtime errors, ensuring a robust and user-friendly application.

## Project Structure

- **App1**: Demonstrates how to handle `ArithmeticException` and `ArrayIndexOutOfBoundsException` by performing a division operation and checking for array index out-of-bounds.

- **Math**: A helper class used to perform a division operation.

- **App2**: Shows the use of a `finally block`, ensuring certain actions are always executed, regardless of whether an exception occurred or not.

### App1
The **App1** class demonstrates handling exceptions in the division operation. It attempts to divide two arrays' elements and handles exceptions such as `ArithmeticException` (division by zero) and `ArrayIndexOutOfBoundsException` (when the index exceeds the array length). A generic exception is also handled in case of other unforeseen errors.

```java
package trycatch;

import javax.swing.JOptionPane;

public class App1 {
    public static void main(String[] args) {
        Math math = new Math();
        int[] numbers = new int[] {10, 20, 30, 100}; // 0 1 2 3
        int[] numbers2 = new int[] {2, 0, 4}; // 0 1 2

        for (int index = 0; index < 4; index++) {
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
            } catch (Exception error) {
                System.out.println("Generic error");
            }
        }
        System.out.println("Final message:");
    }
}
```
#### Expected Output for App1:

- `5` (for the first division)

- `Phrase after exception` (for successful executions)

- `Calculation error: / by zero` (for division by zero)

- `Array error: Index 3 out of bounds for length 3` (if the array index exceeds the size)

### Math
The **Math** class contains a method `divide` that takes two integers and divides them. If the second number is zero, an exception will be thrown and caught by the App1 class.

```java
package trycatch;

public class Math {
    public void divide(int numberA, int numberB) {
        System.out.println(numberA / numberB);
    }
}
```

### App2

The **App2** class demonstrates the use of the `finally block`. It prints a message before attempting a division and then catches the `ArithmeticException`. No matter what happens (whether an exception occurs or not), the code inside the `finally` block is executed.

```java
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
            System.out.println("I will be executed regardless of whether an error occurred or not");
        }
        System.out.println("Final message");
    }
}
```

#### Expected Output for App2:

- `Message before exception` (printed before the exception is thrown)

- `Error: / by zero` (printed after the exception is caught)

- `I will be executed regardless of whether an error occurred or not` (printed from the `finally` block)

- `Final message` (printed as the final line of execution)

## What I Learned on Day 8

On Day 8, I focused on understanding and working with **exception handling** in Java using `try`, `catch`, and `finally` blocks. Here's a summary of what I explored and learned:

### Exception Handling

- **try Block**: Encloses code that may throw an exception. If an exception occurs, the control flow is passed to the appropriate `catch` block.

- **catch Block**: Used to handle exceptions that occur in the `try` block. Multiple `catch` blocks can be used to handle different types of exceptions. In the project, I handled the `ArithmeticException` for division by zero and `ArrayIndexOutOfBoundsException` for array access errors.

- **finally Block**: A block of code that is always executed, regardless of whether an exception occurs. It is ideal for cleanup actions that need to be performed, such as closing files or releasing resources.

### Key Concepts

- **Handling Multiple Exceptions**: I learned how to handle specific exceptions using different `catch` blocks for different types of errors, making the code more precise and user-friendly.

- **Generic Exception Handling**: By catching all exceptions with a generic `Exception` handler, I learned how to provide a fallback for unexpected problems.

- **Execution Flow**: I explored how the `finally` block is always executed after the `try-catch` blocks, ensuring that important actions, such as logging or resource cleanup, are performed regardless of errors.

### Conclusions

- Exception handling is crucial for making Java programs more robust and user-friendly by preventing crashes and providing meaningful error messages.
- The `finally` block is a powerful tool to ensure that code execution is clean and reliable, even when exceptions are thrown.
- Using multiple `catch` blocks allows for handling specific error types, improving the accuracy and clarity of the program's response to failures.

## How to Run the Project

1. Clone the repository to your local machine using the following command:
```bash
git clone https://github.com/LuisGustavoDev/100-days-of-java-programming.git
```
2. Compile and run the **App1.java** file from the trycatch package.

3. Observe the exception handling behaviors, including division by zero and accessing out-of-bounds indices, by checking the console output.

4. Compile and run the **App2.java** file from the trycatch package.

5. Observe the console output for the error message "Error: / by zero," followed by the "finally" block message and the "Final message," demonstrating the execution flow of try, catch, and finally blocks.