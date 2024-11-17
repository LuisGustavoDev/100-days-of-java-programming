package game;

public class App {
    public static void main(String[] args) {
        
        Character character = new Character("Luís");
        System.out.println(character);
        character.attack();

        Archer archer = new Archer("Legolas");
        System.out.println(archer);
        archer.attack();
    }
}
