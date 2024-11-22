package animals;

public class Bird extends Animal{
    
    public Bird(String name) {
        super(name); // first line -> contains the call to the superclass constructor
    }

    public void fly() {
        System.out.printf("The %s is flying...\n", getName());
    }

}
