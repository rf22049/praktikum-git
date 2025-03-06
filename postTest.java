import java.util.Scanner;

public class postTest {

    public static void main(String[] args) {
        
        System.out.print("Masukkan nama Anda: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("Masukkan usia Anda: ");
        int age = input.nextInt();
        System.out.print("Masukkan jumlah dana Anda: Rp ");
        double money = input.nextDouble();
        System.out.print("Masukkan jumlah rata-rata pengeluaran harian Anda: Rp ");
        int expense = input.nextInt();

        System.out.println("\nData yang Anda masukkan:");
        System.out.println("Nama Anda: " + name);
        double ageDouble = (double) age;
        int moneyInt = (int) money;
        System.out.println("Usia Anda: " + age + " tahun");
        System.out.println("Jumlah dana Anda: Rp " + moneyInt);
        System.out.println("Jumlah rata-rata pengeluaran harian Anda: Rp " + expense);



        int moneyEstimation = moneyInt / (expense * 30);
        System.out.println("Estimasi bulan bertahan: " + moneyEstimation + " bulan");
        boolean isSafe = moneyEstimation < 1;
        if (isSafe) {
            System.out.println("PERINGATAN: Keuangan Anda kurang stabil!");
        }
        else {
            System.out.println("Keuangan Anda dalam kondisi aman");
        }

        int moneyLeft = moneyInt - (expense * 30);
        System.out.println("Sisa uang dalam sebulan: " + moneyLeft);

        boolean isage = age > 30;
        System.out.println("Apakah usia lebih dari 30? " + isage);
        boolean isOk = age > 30 && money > 10000000;
        System.out.println("Apakah usia > 30 dan uang > 10 juta? " + isOk);
        boolean isIt = age < 30 || money > 5000000;
        System.out.println("Apakah usia < 30 atau uang > 5 juta? " + isIt);

        System.out.print("Masukkan jumlah hutang Anda: Rp ");
        int owe = input.nextInt();
        Math.abs(owe);
        System.out.println("Nilai absolut dari hutang: Rp " + owe);
        Math.ceil(expense);
        System.out.println("Pengeluaran harian setelah pembulatan: Rp " + expense);
        int bonusAcak = 100000 + (int)(Math.random() * (1000000 - 100000));
        int total = moneyLeft + bonusAcak;
        System.out.println("Total uang yang dimiliki setelah pengeluaran dan bonus: Rp " + total);
        System.out.println("Bonus acak yang didapat: Rp " + bonusAcak);




        input.close();
        
    }
    
}
