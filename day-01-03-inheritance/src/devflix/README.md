# Polymorphism and Overloading in Java

This project demonstrates the concepts of **polymorphism** and **method overloading** in Java. It showcases how different classes like **Video**, **Film**, and **Serie** interact through inheritance, and how methods can be overloaded to provide flexible functionality.

## Project Structure

- **Video (Base Class)**: Represents a general video with basic attributes like a name and a generic `play()` method.

- **Film (Subclass of Video)**: Adds attributes like audio and caption, and demonstrates **method overloading** by defining multiple `play()` methods.

- **Serie (Subclass of Film)**: Extends the functionality with additional attributes such as seasons, episodes, and the ability to play a specific episode using custom logic.

### Video

The **Video** class serves as the base class, defining common properties like `name` and a generic `play()` method.

```java
public class Video {

    private String name;

    public Video(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Play: any video");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

 // Getters and setters...

```

### Film

The **Film** class extends **Video** and adds new functionality:

- **Attributes**: Audio and caption.

- **Method Overloading**: Demonstrates the ability to define multiple versions of the `play()` method with different parameters.

```java
public class Film extends Video {
    private String audio;
    private String caption;

    public Film(String name) {
        super(name);
        this.audio = "English";
        this.caption = "none"; 
    }

    @Override
    public void play() {
        System.out.println("Play: film " + getName());
    }

    public void play(String audio) {
        this.audio = audio;
        this.caption = audio.equals("English") ? "none" : "English";
        System.out.println("Play: " + toString());
    }

    public void play(String audio, String caption) {
        this.audio = audio;
        this.caption = caption;
        System.out.println("Play: " + toString());
    }

    @Override
    public String toString() {
        return String.format("Film %s (audio %s, caption %s)", getName(), audio, caption);
    }
}
```

### Serie

The **Serie** class extends **Film** and introduces attributes like `seasons`, `episodesPerSeason`, `currentEpisode`, and `currentSeason`. It also includes custom logic to validate and play specific episodes.

```java
public class Serie extends Film {
    private Integer seasons;
    private Integer episodesPerSeason;
    private Integer currentEpisode;
    private Integer currentSeason;

    public Serie(String name, Integer seasons, Integer episodesPerSeason) {
        super(name);
        this.seasons = seasons;
        this.episodesPerSeason = episodesPerSeason;
        this.currentEpisode = 1;
        this.currentSeason = 1;
    }

    public void play(Integer season, Integer episode) {
        if (validateEpisode(season, episode)) {
            this.currentSeason = season;
            this.currentEpisode = episode;
            System.out.println("Play: " + toString());
        } else {
            System.out.println("Invalid episode");
        }
    }

    private boolean validateEpisode(Integer season, Integer episode) {
        return season > 0 && episode > 0 && season <= seasons && episode <= episodesPerSeason;
    }

    @Override
    public String toString() {
        return String.format("Serie %s %dx%02d (audio %s, caption %s)",
            getName(),
            currentSeason,
            currentEpisode,
            getAudio(),
            getCaption());
    }
}
```

### Main Application

In the **App.java**, I instantiated objects for **Film** and **Serie** to demonstrate **polymorphism** and **method overloading**.

```java
public class App {
    public static void main(String[] args) {
        Film film = new Film("Lion King");
        film.play("English");
        film.play("English", "Portuguese");

        Serie serie = new Serie("The Last of Us", 2, 10);
        System.out.println(serie);
        serie.play(3, 15);
    }
}
```

## What I Learned Today
Today, I explored the following concepts:

- **Polymorphism**: Using a single method (`play()`) in different ways based on the class of the object (`Film` vs. `Serie`).

- **Method Overloading**: Defining multiple versions of the `play()` method in the **Film** class, showcasing how methods can have different parameter sets to provide flexibility.

- **Inheritance**: Building a class hierarchy where **Film** and **Serie** extend the base **Video** class, inheriting its attributes and methods.

- **Validation** Logic: Creating a method (`validateEpisode`) in the **Serie** class to ensure that only valid seasons and episodes can be played.

This exercise helped me better understand how Java handles object-oriented principles, allowing for reusable and scalable code.

## How to Run the Project

1. Clone the repository to your local machine using the following command:
```bash
git clone https://github.com/LuisGustavoDev/100-days-of-java-programming.git
```
2. Compile and run the **App.java** file from devflix package.
3. Observe the behaviors of each class by checking the console output for the different methods, particularly the use of **polymorphism** (e.g., different `play()` implementations for **Film** and **Serie**) and **method overloading** in the **Film** class.