package animals;


// Animal -> superclass 
// Dog -> subclass
// Cat -> subclass
// Bird -> subclass
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

    public void setNome(String name) {
        this.name = name;
    }

    
}
