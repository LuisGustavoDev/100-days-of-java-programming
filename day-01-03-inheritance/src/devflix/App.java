package devflix;

public class App {
    
    // Polymorphism is the ability of an object to take on different forms,
    // allowing methods to be used in different ways depending on the class of the object.

    public static void main(String[] args) {
       Film film = new Film("Lion King");
       film.play("English");
       film.play("English", "Portuguese");

       Serie serie = new Serie("The last of us", 2, 10);
       System.out.println(serie);
       serie.play(3, 15);
    }
}
