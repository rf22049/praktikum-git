package week09.THT;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static HashMap<String, Profile> allProfiles = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n<=== Welcome to the game! ===>");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Pilih: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    doRegister(sc);
                    break;
                case "2":
                    doLogin(sc);
                    break;
                case "3":
                    System.out.println("Terima kasih sudah bermain. Bye!");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        sc.close();
    }

    private static void doRegister(Scanner sc) {
        System.out.print("Masukkan username baru: ");
        String user = sc.nextLine().trim();
        if (allProfiles.containsKey(user)) {
            System.out.println("Username sudah terdaftar!");
            return;
        }
        System.out.print("Masukkan password: ");
        String pass = sc.nextLine().trim();

        Profile newProfile = new Profile(user, pass);
        allProfiles.put(user, newProfile);
        System.out.println("Registrasi berhasil! Silakan login.");
    }

    private static void doLogin(Scanner sc) {
        System.out.print("Username: ");
        String user = sc.nextLine().trim();
        System.out.print("Password: ");
        String pass = sc.nextLine().trim();

        if (!allProfiles.containsKey(user)) {
            System.out.println("Username tidak ditemukan.");
            return;
        }
        Profile profile = allProfiles.get(user);
        if (!profile.getPassword().equals(pass)) {
            System.out.println("Password salah.");
            return;
        }

        System.out.println("Login berhasil! Selamat datang, " + user + ".");
        profileMenu(sc, profile);
    }

    private static void profileMenu(Scanner sc, Profile profile) {
        boolean inProfile = true;
        while (inProfile) {
            System.out.println("\n<=== Menu Karakter (User: " + profile.getUsername() + ") ===>");
            System.out.println("1. Buat karakter baru");
            System.out.println("2. Pilih karakter yang sudah ada");
            System.out.println("3. Logout");
            System.out.print("Pilihan: ");
            String pChoice = sc.nextLine();

            switch (pChoice) {
                case "1":
                    Character newChar = GameMechanic.characterCreation(sc);
                    profile.addCharacter(newChar);
                    break;

                case "2":
                    if (profile.getCharacters().isEmpty()) {
                        System.out.println("Anda belum punya karakter. Silakan buat dahulu.");
                        break;
                    }
                    System.out.println("Daftar karakter Anda:");
                    int idx = 1;
                    for (Character c : profile.getCharacters()) {
                        System.out.println(idx + ". " + c.getCharacterName() +
                                           " (HP=" + c.getHealth() + ", STR=" + c.getStrength() + ")");
                        idx++;
                    }
                    System.out.print("Pilih nomor karakter (atau 0 untuk batal): ");
                    int pilihNomor = Integer.parseInt(sc.nextLine());
                    if (pilihNomor <= 0 || pilihNomor > profile.getCharacters().size()) {
                        System.out.println("Membatalkan pemilihan.");
                        break;
                    }
                    Character selected = profile.getCharacters().get(pilihNomor - 1);
                    System.out.println("Anda memilih: " + selected.getCharacterName());
                    GameMechanic.startAdventure(sc, selected);
                    break;

                case "3":
                    System.out.println("Logout. Sampai jumpa!");
                    inProfile = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
