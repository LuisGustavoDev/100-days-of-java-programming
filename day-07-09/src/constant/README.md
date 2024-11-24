# CPF, Login, and Math Utilities in Java

This project demonstrates a Java application with CPF validation, password verification, and mathematical utilities. It focuses on using constants (`static final`) and static methods to improve code clarity and maintainability. The classes are designed to utilize these constants, ensuring that fixed values are centralized and easily updated when necessary.

## Project Structure

- **Cpf**: Validates CPF attributes using constants to represent position indices.

- **Login**: Verifies if the password meets the minimum length requirement.

- **Math**: Calculates the area of a circle using a constant for Pi.

- **MathConst**: Contains static constants for mathematical values.

### Cpf

The **Cpf** class is designed to validate CPF strings by extracting information about the region and verification digits. Constants are used to represent the positions of these attributes in the string, making the code more readable and easier to maintain. The use of constants ensures that if the logic needs to change, the fixed values are updated in a single location, avoiding errors in multiple parts of the code.

```java
package constant;

public class Cpf {

    private static final int CPF_REGION_INDEX = 8;
    private static final int FIRST_VERIFIER_INDEX = 9;
    private static final int SECOND_VERIFIER_INDEX = 10;

    public void validate(String cpf) {
        // ABCDEFGHIJK
        // A-H: an identifier issued by the federal revenue agency
        // I (8): the region where the CPF was issued
        // J (9): verification digits
        // K (10): verification digits
        int region = cpf.charAt(CPF_REGION_INDEX);
        int firstCheckDigit = cpf.charAt(FIRST_VERIFIER_INDEX);
        int secondCheckDigit = cpf.charAt(SECOND_VERIFIER_INDEX);
    }
}
```

### MathConst

The **MathConst** class contains constants for common mathematical values like Pi and the acceleration due to gravity. These constants can be used throughout the application for calculations that require these fixed values.

```java
package constant;

public final class MathConst {
    // Constants for mathematical values
    public static final double PI = 3.14;
    public static final double GRAVITY_ACCELERATION = 9.8;
}
```

### Math Class

The **Math** class provides a method to calculate the area of a circle using a constant for Pi. The constant `PI` is used to avoid hardcoding the value of Pi throughout the class, ensuring that it is defined in one place and can be easily updated if necessary.

```java
package constant;

public class Math {

    // Constant for the value of Pi
    private static final double PI = 3.14;

    // Constant for gravity acceleration
    private static final double GRAVITY_ACCELERATION = 9.8;

    // Method to calculate the area of a circle
    public static double circleArea(double radius) {
        // PI = 3.14
        double area = PI * radius * radius;
        return area;
    }
}
```

### Login Class

The **Login** class provides a method to verify whether a password meets the minimum length requirement. The constant `MIN_LENGTH_PASSWORD` is used to define the minimum acceptable length for the password, ensuring consistency throughout the application.

```java
package constant;

public class Login {
    
    // Constant for the minimum password length
    private static final int MIN_LENGTH_PASSWORD = 7;

    // Method to verify if the password meets the minimum length requirement
    public void verifyPassword(String password) {
        if (password.length() >= MIN_LENGTH_PASSWORD) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
```

## What I Learned on Day 7

On **Day 7**, I focused on learning how to work with **constants (static final)** in Java. I applied constants to improve code maintainability, reducing the risk of errors by centralizing values that are used in multiple places. For example, in the **Cpf** and **Login** classes, constants were used to represent fixed values, such as the positions of digits in a CPF string and the minimum password length. 

I also explored how **static methods** can operate independently of object instances, as demonstrated in the **Math** class, where I used a static method to calculate the area of a circle. 

These concepts are crucial for writing clean, maintainable, and error-free code.

## How to Run the Project

1. Clone the repository to your local machine using the following command:
```bash
git clone https://github.com/LuisGustavoDev/100-days-of-java-programming.git
```

2. Navigate to the constant package and run the following files:

- **MathConst.java**: Demonstrates the use of constants for mathematical values (`PI`, `GRAVITY_ACCELERATION`).

- **Math.java**: Shows how a static method uses `PI` to calculate the area of a circle.

- **Login.java**: Uses a constant (`MIN_LENGTH_PASSWORD`) to validate password length.

- **Cpf.java**: Validates CPF using constants for digit positions (`CPF_REGION_INDEX`, `FIRST_VERIFIER_INDEX`, `SECOND_VERIFIER_INDEX`).