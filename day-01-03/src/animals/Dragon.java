package animals;


// Dragon -> subclass
// Bird -> superclass 
public class Dragon extends Bird {

    public Dragon(String name) {
        super(name); // first line -> contains the call to the superclass constructor
    }

    public void breatheFire() {
        System.out.printf("The %s is breathing fire...\n", getName());
    }

    
}
