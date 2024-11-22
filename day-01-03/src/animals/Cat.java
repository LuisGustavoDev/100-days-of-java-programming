package animals;

// Cat -> subclass
// Animal -> superclass 
public class Cat extends Animal {

    public Cat(String name) {
        super(name); // first line -> contains the call to the superclass constructor
    }

    public void meow() {
        System.out.printf("The %s is meowing...\n", getName());
    }
}
