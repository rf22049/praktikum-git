import java.util.Scanner;

public class latihan2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        int jumlahKalimat = kalimat.length();

        int jumlahVokal = 0;
        for (i = 0; i < kalimat.length(); i++){
            char huruf = kalimat.charAt(i);

            if (huruf == 'a' || huruf == 'e' || huruf == 'i' || huruf == 'o' || huruf 'u'){
                jumlahVokal++;
            }
        }

        System.out.println("Jumlah huruf vokal dalam kalimat: " + jumlahVokal);

        switch(jumlahKalimat % 2){
            case 1:
            System.out.println("Jumlah vokal ganjil");
            break;
            case 0:
            System.out.println("Jumlah vokal genap");
            break;
            default:
            break;
        }

        String kalimatArray[] = kalimat;
        for (f = jumlahVokal + 1; i > jumlahVokal; f--){
            System.out.println("karakter =" + jumlahVokal[f]);
        }


    }
}