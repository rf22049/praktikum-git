package postTest06;

import java.util.Scanner;
import postTest06.universitas.Mahasiswa;
import postTest06.universitas.ManajemenMahasiswa;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ManajemenMahasiswa manajemen = new ManajemenMahasiswa();
        int pilihan;

        do{
            System.out.println("=== MENU ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Semua Mahasiswa");
            System.out.println("3. Tampilkan Mahasiswa dengan IPK Tertinggi");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan){
                case 1:
                    System.out.print("Masukkan NIM   : ");
                    int nim = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan Nama  : ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Prodi : ");
                    String prodi = input.nextLine();
                    System.out.print("Masukkan IPK   : ");
                    double ipk = input.nextDouble();
                    manajemen.tambahMahasiswa(new Mahasiswa(nama, nim, prodi, ipk));
                    System.out.println("Data berhasil ditambahkan!");
                    break;
                case 2:
                    System.out.println("DAFTAR MAHASISWA:");
                    manajemen.tampilkanSemua();
                    System.out.println("-------------------------");
                    break;
                case 3:
                    manajemen.tampilkanIPKTertinggi();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        }
        
        while (pilihan != 4);

        input.close();
    }
}