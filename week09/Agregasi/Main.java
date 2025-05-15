package week09.Agregasi;

import java.util.ArrayList;
import java.util.List;

class Mahasiswa{
    String nama;

    Mahasiswa(String nama){
        this.nama = nama;
    }
}

class Universitas{
    String namaUniv;
    List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    
    Universitas(String namaUniv){
        this.namaUniv = namaUniv;
    }

    void tambahMahasiswa(Mahasiswa mhs){
        daftarMahasiswa.add(mhs);
    }

    void tampilkanMahasiswa(){
        for(Mahasiswa mhs : daftarMahasiswa){
            System.out.println(mhs.nama);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("A");
        Mahasiswa mhs2 = new Mahasiswa("B");
        Mahasiswa mhs3 = new Mahasiswa("C");

        Universitas uper = new Universitas("Universitas Pertamina");
        uper.tambahMahasiswa(mhs1);
        uper.tambahMahasiswa(mhs2);
        uper.tambahMahasiswa(mhs3);

        uper.tampilkanMahasiswa();
    }
    
}
