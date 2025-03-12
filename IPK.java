import java.util.Scanner;

public class IPK{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program penilaian mahasiswa");
        System.out.println("---------------------------");
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        int nim = input.nextInt();
        System.out.print("Masukkan usia mahasiswa: ");
        int usia = input.nextInt();

        System.out.println("Data mahasiswa yang dimasukkan");
        System.out.println("Nama mahasiswa: " + nama);
        System.out.println("NIM mahasiswa: " + nim);
        System.out.println("Usia mahasiswa: " + usia);

        System.out.print("Masukkan jumlah mata kuliah yang diambil: ");
        int jumlahMatkul = input.nextInt();

        if (jumlahMatkul == 1){
            System.out.print("Masukkan nilai mata kuliah pertama: ");
            int matkul1 = input.nextInt();
            double ipk = (double) matkul1 / 25;
            double ipkFix = Math.round(ipk * 10) / 10.0;
            System.out.println("nilai IPK mahasiswa: " + ipkFix);
            boolean isResult = ipk >= 3.5 && jumlahMatkul > 4;
            System.out.println("Apakah IPK mahasiswa 3.5 ke atas dan mengambil mata kuliah lebih dari 4? " + isResult);
            boolean isOver = ipk < 2.5 || jumlahMatkul < 4;
            System.out.println("Apakah IPK mahasiswa kurang dari 2.5 dan mengambil mata kuliah kurang dari 4? " + isOver);
        }
        else if (jumlahMatkul == 2){
            System.out.print("Masukkan nilai mata kuliah pertama: ");
            int matkul1 = input.nextInt();
            System.out.print("Masukkan nilai mata kuliah kedua: ");
            int matkul2 = input.nextInt();
            double ipk = ((double)(matkul1 + matkul2) / 2) / 25;
            double ipkFix = Math.round(ipk * 10) / 10.0;
            System.out.println("nilai IPK mahasiswa: " + ipkFix);
            boolean isResult = ipk >= 3.5 && jumlahMatkul > 4;
            System.out.println("Apakah IPK mahasiswa 3.5 ke atas dan mengambil mata kuliah lebih dari 4? " + isResult);
            boolean isOver = ipk < 2.5 || jumlahMatkul < 4;
            System.out.println("Apakah IPK mahasiswa kurang dari 2.5 dan mengambil mata kuliah kurang dari 4? " + isOver);
        }
        else if (jumlahMatkul == 3){
            System.out.print("Masukkan nilai mata kuliah pertama: ");
            int matkul1 = input.nextInt();
            System.out.print("Masukkan nilai mata kuliah kedua: ");
            int matkul2 = input.nextInt();
            System.out.print("Masukkan nilai mata kuliah ketiga: ");
            int matkul3 = input.nextInt();
            double ipk = ((double)(matkul1 + matkul2 + matkul3) / 3) / 25;
            double ipkFix = Math.round(ipk * 10) / 10.0;
            System.out.println("nilai IPK mahasiswa: " + ipkFix);
            boolean isResult = ipk >= 3.5 && jumlahMatkul > 4;
            System.out.println("Apakah IPK mahasiswa 3.5 ke atas dan mengambil mata kuliah lebih dari 4? " + isResult);
            boolean isOver = ipk < 2.5 || jumlahMatkul < 4;
            System.out.println("Apakah IPK mahasiswa kurang dari 2.5 dan mengambil mata kuliah kurang dari 4? " + isOver);
        }
        else if (jumlahMatkul == 4){
            System.out.print("Masukkan nilai mata kuliah pertama: ");
            int matkul1 = input.nextInt();
            System.out.print("Masukkan nilai mata kuliah kedua: ");
            int matkul2 = input.nextInt();
            System.out.print("Masukkan nilai mata kuliah ketiga: ");
            int matkul3 = input.nextInt();
            System.out.print("Masukkan nilai mata kuliah keempat: ");
            int matkul4 = input.nextInt();
            double ipk = ((double)(matkul1 + matkul2 + matkul3 + matkul4) / 4) / 25;
            double ipkFix = Math.round(ipk * 10) / 10.0;
            System.out.println("nilai IPK mahasiswa: " + ipkFix);
            boolean isResult = ipk >= 3.5 && jumlahMatkul > 4;
            System.out.println("Apakah IPK mahasiswa 3.5 ke atas dan mengambil mata kuliah lebih dari 4? " + isResult);
            boolean isOver = ipk < 2.5 || jumlahMatkul < 4;
            System.out.println("Apakah IPK mahasiswa kurang dari 2.5 dan mengambil mata kuliah kurang dari 4? " + isOver);
        }
        else if (jumlahMatkul > 4){
            System.out.print("Masukkan nilai rata-rata mata kuliah yang diambil (0 - 100): ");
            int rataRata = input.nextInt();
            double ipk = (double) rataRata / 25;
            double ipkFix = Math.round(ipk * 10) / 10.0;
            System.out.println("nilai IPK mahasiswa: " + ipkFix);
            boolean isResult = ipk >= 3.5 && jumlahMatkul > 4;
            System.out.println("Apakah IPK mahasiswa 3.5 ke atas dan mengambil mata kuliah lebih dari 4? " + isResult);
            boolean isOver = ipk < 2.5 || jumlahMatkul < 4;
            System.out.println("Apakah IPK mahasiswa kurang dari 2.5 dan mengambil mata kuliah kurang dari 4? " + isOver);
        }

        boolean isAdult = usia > 22;
        System.out.println("Apakah mahasiswa berumur lebih dari 22 tahun? " + isAdult);
        int nomorAntrian = (int)(Math.random() * 100);
        System.out.println("Nomor antrian konsultasi akademik: " + nomorAntrian);

        input.close();
    }
}