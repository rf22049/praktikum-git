import java.util.Scanner;

public class latihan2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();


        int jumlahVokal = 0;
        for (int i = 0; i < kalimat.length(); i++){
            char huruf = kalimat.charAt(i);

            if (huruf == 'a' || huruf == 'e' || huruf == 'i' || huruf == 'o' || huruf == 'u'){
                jumlahVokal++;
            }
        }

        System.out.println("Jumlah huruf vokal dalam kalimat: " + jumlahVokal);

        switch(jumlahVokal % 2){
            case 1:
            System.out.println("Jumlah vokal ganjil");
            break;
            case 0:
            System.out.println("Jumlah vokal genap");
            break;
            default:
            break;
        }

        char kalimatArray[] = kalimat.toCharArray();

        for (int i = kalimatArray.length; i >=0; i--){
            System.out.println("karakter = " + kalimatArray[i]);
        }


    }
}