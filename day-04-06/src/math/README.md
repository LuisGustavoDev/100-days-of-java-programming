# Math Utilities and Car Application in Java

This project demonstrates a simple Java application featuring mathematical utilities and car management. It focuses on the usage of static methods, along with object-oriented principles such as encapsulation.

## Project Structure

- **Math**: Provides utility methods for common mathematical operations, such as addition, squaring, and calculating the area of a circle, implemented as static methods.

- **Car**: Represents a car with attributes like name and year, showcasing instance properties and shared static fields.

- **App**: The main entry point of the application, demonstrating the functionality of the `Math` and `Car` classes.

### Math

The **Math** class contains static methods for mathematical operations. These methods can be called without creating an instance of the class, emphasizing reusability and efficiency.

```java
package math;

public class Math {

    private static double piValue = 3.14;

    public static int sum(int numberA, int numberB) {
        return numberA + numberB;
    }

    public static double square(double side) {
        return side * side;
    }

    public static double circleArea(double radius) {
        double area = piValue * square(radius);
        return area;
    }

    public static double doubleCircleArea(double radius) {
        double area = circleArea(radius);
        return area * 2;
    }
}
```

### Car

The **Car** class represents cars with a name and manufacturing year. It also features a static field (`purchaseYear`) shared across all instances, demonstrating class-level variables.

```java
package math;

public class Car {
    private String name;
    private int year;
    public static int purchaseYear = 2023;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
```

### Main Application

The **App** class serves as the main entry point. It demonstrates how to use static methods from the `Math` class and manage `car` objects using the `Car` class.

```java
package math;

public class App {

    private static void showMessage() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        showMessage();

        Car car1 = new Car("Car1", 2023);
        Car car2 = new Car("Car2", 1999);

        System.out.println(car1.getName());
        System.out.println(car2.getName());
        System.out.println(Car.purchaseYear);
    }
}
```

## What I Learned on Day 6

On Day 6, I focused on applying **static methods** and fields in Java, alongside reinforcing key object-oriented principles. Here are the main concepts I explored:

- **Static Methods**: I created a `Math` class with static methods, allowing for reusable functionality across the program without the need for creating an instance of the class. The static methods I implemented include `sum()`, `square()`, and `circleArea()`, which perform basic mathematical operations.

- **Static Fields**: In the `Math` class, I used a static field, `piValue`, to represent the value of Pi. This static field is shared across all instances of the class and can be accessed directly through the class, rather than through an object instance.

- **Constructors**: I used constructors in the `Car` class to initialize each instance with specific attributes, such as `name` and `year`. This allowed me to create objects with predefined values and understand how constructors work in object instantiation.

- **Static vs. Instance Variables**: I explored the distinction between static and instance variables by using a static `purchaseYear` field in the `Car` class and instance fields like `name` and `year`. Static fields are shared across all instances, while instance fields hold unique values for each object.

## How to Run the Project

1. Clone the repository to your local machine using the following command:
```bash
git clone https://github.com/LuisGustavoDev/100-days-of-java-programming.git
```
2. Compile and run the **App.java** file from `math` package.
3. Observe the output of the static methods such as `sum()`, `square()`, and `circleArea()`, along with the behavior of the `Car` class with its constructor and static field `purchaseYear`. The output will be shown in the console when executed.