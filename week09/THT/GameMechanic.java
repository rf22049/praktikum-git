package week09.THT;

import java.util.Random;
import java.util.Scanner;

public class GameMechanic {

    public static Character characterCreation(Scanner sc) {
        System.out.print("Masukkan nama karakter: ");
        String name = sc.nextLine().trim();

        System.out.println("Pilih kelas:");
        System.out.println("1. Mage    (health=80, strength=12)");
        System.out.println("2. Warrior (health=120, strength=8)");
        System.out.println("3. Archer  (health=100, strength=10)");
        System.out.print("Pilihan Anda: ");
        int classChoice = Integer.parseInt(sc.nextLine());

        Character newChar;
        switch (classChoice) {
            case 1:
                newChar = new Character(name, 80, 12);
                break;
            case 2:
                newChar = new Character(name, 120, 8);
                break;
            case 3:
                newChar = new Character(name, 100, 10);
                break;
            default:
                System.out.println("Pilihan tidak valid. Default sebagai Warrior.");
                newChar = new Character(name, 120, 8);
        }

        System.out.println("Karakter \"" + newChar.getCharacterName() + "\" berhasil dibuat!");
        newChar.printStatus();
        return newChar;
    }

    public static void startAdventure(Scanner sc, Character player) {
        Random rand = new Random();
        System.out.println("\n=== Memulai petualangan dengan " + player.getCharacterName() + " ===");

        boolean inGame = true;
        while (inGame && player.getHealth() > 0) {
            System.out.println("\nApa yang ingin Anda lakukan?");
            System.out.println("1. Explore (kesempatan random encounter)");
            System.out.println("2. Cek status");
            System.out.println("3. Keluar dari petualangan");
            System.out.print("Pilihan: ");
            int action = Integer.parseInt(sc.nextLine());

            switch (action) {
                case 1:
                    randomEncounter(sc, player);
                    break;
                case 2:
                    player.printStatus();
                    break;
                case 3:
                    System.out.println("Anda mundur dari petualangan. Sampai jumpa!");
                    inGame = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        if (player.getHealth() <= 0) {
            System.out.println("\n=== Game Over ===");
            System.out.println(player.getCharacterName() + " telah kalah.");
        }
    }

    private static void randomEncounter(Scanner sc, Character player) {
        Random rand = new Random();
        int roll = rand.nextInt(100) + 1; 

        if (roll <= 60) {
            System.out.println("Anda bertemu musuh!");
            Enemy enemy = new Enemy(); 
            System.out.println("Musuh: " + enemy.getCharacterName() +
                               " (HP=" + enemy.getHealth() + ", STR=" + enemy.getStrength() + ")");
            battleLoop(sc, player, enemy);

        } else if (roll <= 80) {
            System.out.println("Anda menemukan peti harta! Mendapat 50 gold (logging saja).");
        } else {
            System.out.println("Tidak ada apa-apa di sekitar Anda.");
        }
    }

    private static void battleLoop(Scanner sc, Character player, Enemy enemy) {
        System.out.println("Pertempuran dimulai!");

        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            System.out.println("\nGiliran " + player.getCharacterName() + ": ");
            System.out.println("1. Serang");
            System.out.println("2. Lari");
            System.out.print("Pilihan: ");
            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {
                attack(player, enemy);
                if (enemy.getHealth() <= 0) {
                    System.out.println("Anda mengalahkan " + enemy.getCharacterName() + "!");
                    return;
                }
            } else if (choice == 2) {
                if (new Random().nextBoolean()) {
                    System.out.println("Anda berhasil kabur!");
                    return;
                } else {
                    System.out.println("Gagal kabur!");
                }
            } else {
                System.out.println("Pilihan tidak valid, otomatis menyerang.");
                attack(player, enemy);
                if (enemy.getHealth() <= 0) {
                    System.out.println("Anda mengalahkan " + enemy.getCharacterName() + "!");
                    return;
                }
            }

            System.out.println("\nGiliran musuh: " + enemy.getCharacterName());
            attack(enemy, player);
            if (player.getHealth() <= 0) {
                System.out.println(player.getCharacterName() + " telah dikalahkan...");
                return;
            }
        }
    }

    public static void attack(Character attacker, Character defender) {
        int damage = attacker.getStrength();
        defender.setHealth(defender.getHealth() - damage);
        System.out.println(attacker.getCharacterName() + " menyerang " +
                           defender.getCharacterName() + " untuk " + damage + " damage!");
        System.out.println(defender.getCharacterName() + " HP tersisa: " + defender.getHealth());
    }
}
