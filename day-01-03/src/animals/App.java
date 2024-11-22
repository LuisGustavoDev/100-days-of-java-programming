package animals;
public class App {
    public static void main (String[] args) {

        Dog dog = new Dog("Pink");
        dog.eat();
        dog.bark();

        Cat cat = new Cat("Snowball");
        cat.meow();

        Dragon dragon = new Dragon("Ice Dragon");
        dragon.breatheFire();
        dragon.fly();

        Pigeon pigeon = new Pigeon("Pidgey");
        pigeon.sendLetter();
        pigeon.makePru();
    }
}
