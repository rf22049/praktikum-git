package Week06.Utama;

import Week06.Dosen.Dosen;
import Week06.Mahasiswa.Mahasiswa;
import Week06.mataKuliah.MataKuliah;
import java.util.ArrayList;

public class Utama {

    public static void tampilkanData(MataKuliah mataKuliah){
        System.out.println("Mata Kuliah: " + mataKuliah.getNama());
        System.out.println("Kode Mata Kuliah: " + mataKuliah.getKodeMK());
        System.out.print("Pengampu: ");
        if (mataKuliah.getPengampu() != null){
            for (Dosen dosen : mataKuliah.getPengampu()){
                System.out.print(dosen.getNama() + ", ");
            }
        } else{
            System.out.print("Tidak ada");
        }
        System.out.println();
        System.out.print("Mahasiswa: ");
        if (mataKuliah.getDaftarMahasiswa() != null){
            for (Mahasiswa mahasiswa : mataKuliah.getDaftarMahasiswa()){
                System.out.print(mahasiswa.getNama() + ", ");
            }
        } else{
            System.out.print("Tidak ada");
        }
        System.out.println("\n");
    }

    public static void main(String[] args){
        Dosen cahya = new Dosen("Cahya", "12345");
        Dosen budi = new Dosen("Budi", "67890");

        Mahasiswa tiara = new Mahasiswa("Tiara", "111");
        Mahasiswa diana = new Mahasiswa("Diana", "222");

        MataKuliah pbo = new MataKuliah("PBO", "123");
        ArrayList<Dosen> pengampuPBO = new ArrayList<>();
        pengampuPBO.add(cahya);
        pbo.setPengampu(pengampuPBO);
        ArrayList<Mahasiswa> mahasiswaPBO = new ArrayList<>();
        mahasiswaPBO.add(tiara);
        mahasiswaPBO.add(diana);
        pbo.setDaftarMahasiswa(mahasiswaPBO);

        MataKuliah kompar = new MataKuliah("Kompar", "124");
        ArrayList<Dosen> pengampuKompar = new ArrayList<>();
        pengampuKompar.add(budi);
        kompar.setPengampu(pengampuKompar);
        ArrayList<Mahasiswa> mahasiswaKompar = new ArrayList<>();
        mahasiswaKompar.add(tiara);
        mahasiswaKompar.add(diana);
        kompar.setDaftarMahasiswa(mahasiswaKompar);

        MataKuliah metnum = new MataKuliah("Metnum", "125");
        ArrayList<Dosen> pengampuMetnum = new ArrayList<>();
        pengampuMetnum.add(budi);
        metnum.setPengampu(pengampuMetnum);
        ArrayList<Mahasiswa> mahasiswaMetnum = new ArrayList<>();
        mahasiswaMetnum.add(tiara);
        metnum.setDaftarMahasiswa(mahasiswaMetnum);

        tampilkanData(pbo);
        tampilkanData(kompar);
        tampilkanData(metnum);
    }
}