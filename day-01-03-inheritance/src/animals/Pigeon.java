package animals;

// Pigeon -> subclass
// Bird -> superclass 
public class Pigeon extends Bird {

    private int sentLetters;

    public Pigeon(String name) {
        super(name); // first line -> contains the call to the superclass constructor
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
