package week09.THT;

import java.util.ArrayList;

public class Profile {
    private String username;
    private String password;
    private ArrayList<Character> characters;

    public Profile(String username, String password) {
        this.username = username;
        this.password = password;
        this.characters = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void addCharacter(Character c) {
        characters.add(c);
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public Character findCharacterByName(String name) {
        for (Character c : characters) {
            if (c.getCharacterName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }
}

class Character extends Profile {
    private String characterName;
    private int health;
    private int strength;

    public Character(String name, int health, int strength) {
        super("defaultUser", "defaultPass");
        this.characterName = name;
        this.health = health;
        this.strength = strength;
    }

    public String getCharacterName() {
        return characterName;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public void setCharacterName(String name) {
        this.characterName = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void printStatus() {
        System.out.println("=== Status Karakter ===");
        System.out.println("Nama   : " + characterName);
        System.out.println("Health : " + health);
        System.out.println("Strength: " + strength);
        System.out.println("========================");
    }

}

class Enemy extends Character {
    public Enemy() {
        super("Enemy", (int) (Math.random() * 100), (int) (Math.random() * 100));
    }
}