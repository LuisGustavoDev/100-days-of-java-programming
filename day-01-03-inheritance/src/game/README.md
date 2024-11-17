# Method Overriding and Inheritance in Java

This project demonstrates the concepts of **method overriding** and **inheritance** in Java. The project defines a **Character** class and a specialized **Archer** subclass, showcasing how different classes can inherit common behavior and override methods to provide specific functionality.

## Project Structure

- Character (Superclass): The base class for all characters, defining general behaviors like attacking.

- Archer (Subclass of Character): A type of character that represents an archer, adding a weapon (bow) and overriding the attack method with a specialized behavior.

### Character

The **Character** class serves as the base class, defining common behaviors for all characters, such as **attack()** and **toString()**, and properties like name, class, and level.

```java
public class Character {

    private String name;
    private String characterClass;
    private int level;

    public Character(String name) {
        this.name = name;
        this.characterClass = "Unknown";
        this.level = 1;
    }

    public void attack() {
        System.out.println("The character is attacking...");
    }

    @Override
    public String toString() {
        return String.format("Name: %s - Class: %s - Level: %d", name, characterClass, level);
    }

    // Getters and setters...
}
```

### Archer (Subclass of Character)

The **Archer** class extends **Character** and introduces the **weapon** attribute, specific to archers. It also overrides the **attack()** method to provide a specialized attack behavior.

```java
public class Archer extends Character {

    private String weapon;
    
    public Archer(String name) {
        super(name); // Calls the superclass constructor
        setCharacterClass("Archer");
        setLevel(2);
        this.weapon = "Bow";
    }

    @Override
    public String toString() {
        String characterInformation = super.toString();
        String archerInformation = String.format(" - Weapon: %s", weapon);
        return characterInformation + archerInformation;
    }

    @Override
    public void attack() {
        System.out.println("The archer is attacking with a bow");
    }
}
```

### Main Application

In the **App.java** class, I instantiate objects for both **Character** and Archer to demonstrate how inheritance and method overriding work in practice.

```java
public class App {
    public static void main(String[] args) {

        // Create a generic character and call methods
        Character character = new Character("Luís");
        System.out.println(character);
        character.attack();

        // Create an archer and call methods
        Archer archer = new Archer("Legolas");
        System.out.println(archer);
        archer.attack();
    }
}
```

## What I Learned Today

Today, I learned how to apply **method overriding** and **inheritance** in Java. Here are the key concepts I explored:

- **Inheritance**: I used inheritance to create a class hierarchy, where the **Archer** class is a specialized subclass of the **Character** class. The Archer inherits common behaviors and attributes, such as `name`, `characterClass`, and `level`, while adding its own behavior, like the weapon attribute.

- **Method Overriding**: I learned how to override methods from the superclass. In this case, the **attack()** method is overridden in the **Archer** class to provide behavior specific to archers (attacking with a bow).

- **`@Override` Annotation**: I used the `@Override` annotation to indicate that the **attack()** method in the **Archer** class is overriding the method in the superclass. This ensures that the method is properly overridden, and if the method signature is incorrect, the compiler will flag an error.

 - **Polymorphism**: By using method overriding, I can call the same method (e.g., **attack()**) on different types of objects and get different behavior based on the object’s actual class (like **Character** vs **Archer**).

- **Constructors and `super()` Keyword**: I used the `super()` keyword to call the constructor of the superclass, ensuring that common attributes (like the character's name) are correctly initialized.

## How to Run the Project

1. Clone the repository to your local machine using the following command:
```bash
git clone https://github.com/LuisGustavoDev/100-days-of-java-programming.git
```
2. Compile and run the **App.java** file from game package.
3. Observe the behaviors of each animal by checking the console output for each respective method.