package game;

public class Archer extends Character{

    private String weapon;
    
    public Archer(String name) {
        super(name);
        setCharacterClass("Archer");
        setLevel(2);
        this.weapon = "Bow";
    }

    @Override
    public String toString() {
        String characterInformation = super.toString();
        String archerInformation = String.format(" - Weapon: %s", weapon);
        return characterInformation + archerInformation;
    }

    @Override
    public void attack() {
        System.out.println("The archer is attacking with a bow");
    }
}
