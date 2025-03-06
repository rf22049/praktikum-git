import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String name = input.nextLine();

        System.out.print("Masukkan NIM Anda: ");
        int id = input.nextInt();

        System.out.print("Masukkan usia Anda: ");
        int age = input.nextInt();

        System.out.print("Masukkan tinggi badan Anda: ");
        double height = input.nextDouble();

        System.out.println("\nData yang Anda masukkan:");
        System.out.println("Nama Anda: " + name);
        System.out.println("NIM Anda: " + id);
        System.out.println("Usia Anda: " + age);
        System.out.println("Tinggi badan Anda: " + height);

        int hasilAritmatika = (age * 2) + (10 / 5) - 3;
        System.out.println("\nHasil perhitungan (usia * 2) + 10/5 - 3: " + hasilAritmatika);

        boolean isAdult = age > 18;
        System.out.println("Apakah usia lebih dari 18? " + isAdult);

        boolean checkLogic = (age > 18) && (height > 160);
        System.out.println("Apakah usia > 18 dan tinggi > 160? " + checkLogic);

        double ageDouble = (double) age;
        int heightInt = (int) height;
        System.out.println("Hasil konversi usia (int ke double): " + ageDouble);
        System.out.println("Hasil konversi tinggi badan (double ke int): " + heightInt);

        input.close();
    }
}