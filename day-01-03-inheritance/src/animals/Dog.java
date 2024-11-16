package animals;

// Dog -> subclass
// Animal -> superclass 
public class Dog extends Animal {

    public Dog(String name) {
        super(name); // first line -> contains the call to the superclass constructor
    }

    public void bark() {
        System.out.printf("The %s is barking...\n", getName());
    }
    public void lick() {
        System.out.printf("The %s is licking...\n", getName());
    }
}
