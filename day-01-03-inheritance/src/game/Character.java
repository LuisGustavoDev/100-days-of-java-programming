package game;

public class Character {
    private String name;
    private String characterClass;
    private int level;
    
    public Character(String name) {
        this.name = name;
        this.characterClass = "none";
        this.level = 1;
    }

    @Override
    public String toString() {
        String information = String.format("%s (level: %d) - Class: %s", name, level, characterClass);
        return information;
    }

    public void attack() {
        System.out.println("The character is attacking");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
}
