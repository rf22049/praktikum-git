import java.util.Scanner;

public class CekNilai{

    String nama;
    String nim;
    String jurusan;
    double ipk = 0.0;
    boolean status;

    CekNilai(String nama, String nim, String jurusan){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    void tampilkanInfo(){
        System.out.println("Nama mahasiswa: " + nama);
        System.out.println("Nim mahasiswa: " + nim);
        System.out.println("Jurusan mahasiswa: " + jurusan);
    }

    void cekLulus(){
        if (ipk >= 3.0){
            status = true;
            System.out.println("Apakah mahasiswa lulus? " + status);
        }
        else{
            status = false;
            System.out.println("Apakah mahasiswa lulus? " + status);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan nim mahasiswa: ");
        String nim = input.nextLine();
        System.out.print("Masukkan jurusan mahasiswa: ");
        String jurusan = input.nextLine();
        System.out.print("Masukkan nilai IPK mahasiswa: ");
        double ipk = input.nextDouble();

        CekNilai mahasiswa = new CekNilai(nama, nim, jurusan);
        mahasiswa.tampilkanInfo();
        mahasiswa.cekLulus();
    }
}