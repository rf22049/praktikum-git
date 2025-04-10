package Week06.mataKuliah;

import java.util.ArrayList;

import Week06.Dosen.Dosen;
import Week06.Mahasiswa.Mahasiswa;

public class MataKuliah {
    private String nama;
    private String kodeMK;
    private ArrayList<Dosen> pengampu;
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public MataKuliah(String nama, String kodeMK){
        this.nama = nama;
        this.kodeMK = kodeMK;
    }

    public ArrayList<Dosen> getPengampu() {
        return pengampu;
    }

    public ArrayList<Mahasiswa> getDaftarMahasiswa(){
        return daftarMahasiswa;
    }

    public void setPengampu(ArrayList<Dosen> pengampu){
        this.pengampu = pengampu;
    }

    public void setDaftarMahasiswa(ArrayList<Mahasiswa> daftarMahasiswa){
        this.daftarMahasiswa = daftarMahasiswa;
    }

    public String getNama(){
        return nama;
    }

    public String getKodeMK(){
        return kodeMK;
    }
}