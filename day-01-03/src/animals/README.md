# Animal Hierarchy in Java

The project defines an **Animal** class hierarchy, with various animals such as **Dog**, **Cat**, **Dragon**, **Pigeon**, and **Bird**. Each animal has specific behaviors, demonstrating **inheritance** (common behaviors across animals), and the possibility of overriding methods (specialized behaviors like barking or meowing).

## Project Structure

- **Animal** (Superclass): The base class for all animals. Defines general behaviors such as eating and drinking.
- **Dog** (Subclass of Animal): Represents a dog, with behaviors such as barking and licking.
- **Cat** (Subclass of Animal): Represents a cat, with the ability to meow.
- **Bird** (Subclass of Animal): Represents a bird, with the ability to fly.
- **Pigeon** (Subclass of Bird): A type of bird that can send letters and make a unique sound ("Pru Pru!").
- **Dragon** (Subclass of Bird): A specialized type of bird that can breathe fire and fly.

### Animal

The **Animal** class is the base class that defines common behavior for all animals, including **eat()** and **drink()**.

```java
public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.printf("The %s is eating...\n", name);
    }

    public void drink() {
        System.out.printf("The %s is drinking...\n", name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```
### Dog (Subclass of Animal)

The Dog class extends Animal and introduces dog-specific behaviors like bark() and lick().
```java
public class Dog extends Animal {

    public Dog(String name) {
        super(name); // Calls the superclass constructor
    }

    public void bark() {
        System.out.printf("The %s is barking...\n", getName());
    }

    public void lick() {
        System.out.printf("The %s is licking...\n", getName());
    }
}
```

### Cat (Subclass of Animal)

The Cat class extends Animal and introduces the behavior of meowing.
```java
public class Cat extends Animal {

    public Cat(String name) {
        super(name); // Calls the superclass constructor
    }

    public void meow() {
        System.out.printf("The %s is meowing...\n", getName());
    }
}
```

### Bird (Subclass of Animal)

The Bird class extends Animal and adds the ability to fly().
```java 
public class Bird extends Animal {

    public Bird(String name) {
        super(name); // Calls the superclass constructor
    }

    public void fly() {
        System.out.printf("The %s is flying...\n", getName());
    }
}
```

### Pigeon (Subclass of Bird)

The Pigeon class extends Bird and adds behaviors such as sending letters and making a unique sound ("Pru Pru!").
```java
public class Pigeon extends Bird {

    private int sentLetters;

    public Pigeon(String name) {
        super(name); // Calls the superclass constructor
        this.sentLetters = 0;
    }

    public void sendLetter() {
        this.sentLetters++;
        System.out.printf("You have sent %d letters.\n", sentLetters);
    }

    public void makePru() {
        System.out.printf("The %s goes 'Pru Pru!'\n", getName());
    }

    public int getSentLetters() {
        return sentLetters;
    }
}
```

### Dragon (Subclass of Bird)

The Dragon class extends Bird and introduces the ability to breathe fire(), in addition to the flying capability inherited from Bird.
```java
public class Dragon extends Bird {
    public Dragon(String name) {
        super(name);
    }

    public void breatheFire() {  // Corrigido de "breathFire" para "breatheFire"
        System.out.printf("The %s is breathing fire...\n", getName());
    }
}
```

### Main Application

In the **App.java class**, I instantiate objects for **Dog**, **Cat**, **Dragon**, and **Pigeon** to demonstrate their specific behaviors:

```java
public class App {
    public static void main (String[] args) {

        Dog dog = new Dog("Pink");
        dog.eat();
        dog.bark();

        Cat cat = new Cat("Snowball");
        cat.meow();

        Dragon dragon = new Dragon("Ice Dragon");
        dragon.breathFire();
        dragon.fly();

        Pigeon pigeon = new Pigeon("Pidgey");
        pigeon.sendLetter();
        pigeon.makePru();
    }
}
```

## What I Learned Today

Today, I learned how to apply inheritance and method overriding in Java. The key concepts I explored include:

- **Inheritance**: I used inheritance to create a class hierarchy where Dog, Cat, Bird, Pigeon, and Dragon are specialized types of the general Animal class.

- **Superclass and Subclasses**: I defined common behaviors (like eat(), drink()) in the Animal superclass, while each subclass added its specific behaviors (e.g., bark(), fly(), breathe fire()).

- **Polymorphism**: I used polymorphism to allow each subclass to have its own implementation of the inherited methods (for example, how a dog barks or a bird flies).

- **Constructors and** `super()` **keyword**: I used the `super()` keyword to call the constructor of the superclass, ensuring that shared attributes (like the animal's name) are correctly initialized.

## How to Run the Project

1. Clone the repository to your local machine using the following command:
```bash
git clone https://github.com/LuisGustavoDev/100-days-of-java-programming.git
```
2. Compile and run the **App.java** file from `animals` package.
3. Observe the behaviors of each animal by checking the console output for each respective method.





