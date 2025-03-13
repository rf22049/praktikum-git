import java.util.Scanner;

public class moneyOrganizer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalBelanja = 0;
        double totalBelanjaFix = 0;

        System.out.print("Masukkan total pembelian: Rp");
        int total = input.nextInt();
        System.out.println("Pilih tipe member yang dimiliki:");
        System.out.println("1. Platinum");
        System.out.println("2. Gold");
        System.out.println("3. Silver");
        System.out.println("4. non-member");
        int member = input.nextInt();

        String eligible = (total - 250000 >= 0) ? "mendapat" : "tidak mendapat";
        System.out.println("Pelanggan " + eligible + " diskon");

        if (total > 500000){
            totalBelanja = total * (1 - (20.0 / 100));
        }
        else if (total >= 250000 && total <= 500000 ){
            totalBelanja = total * (1 - (10.0 / 100));
        }
        else if (total < 250000){
            totalBelanja = total;
        }
        else{
            System.out.println("Input tidak valid");;
        }

        switch (member) {
            case 1:
                totalBelanjaFix = totalBelanja * (1 - (5.0 / 100));
                break;
            case 2:
                totalBelanjaFix = totalBelanja * (1 - (3.0 / 100));
                break;
            case 3:
                totalBelanjaFix = totalBelanja * (1 - (2.0 / 100));
                break;
            case 4:
                totalBelanjaFix = totalBelanja;
                break;
        
            default:
                break;
        }

        System.out.println("Total belanja Anda: Rp" + (int) totalBelanjaFix);
        input.close();

    }
}