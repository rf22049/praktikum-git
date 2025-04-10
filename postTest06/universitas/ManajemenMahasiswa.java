package postTest06.universitas;

import java.util.ArrayList;

public class ManajemenMahasiswa {
    ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();
    
    public void tambahMahasiswa(Mahasiswa m){
        mahasiswa.add(m);
    }

    public void tampilkanSemua(){
        for (int i = 0; i < mahasiswa.size(); i++){
            mahasiswa.get(i).tampilkanData();
        }
    }

    public void tampilkanIPKTertinggi(){
        Mahasiswa mahasiswaTertinggi = mahasiswa.get(0);
            for (int i = 1; i < mahasiswa.size(); i++){
            if (mahasiswa.get(i).getIpk() > mahasiswaTertinggi.getIpk()){
                mahasiswaTertinggi = mahasiswa.get(i);
            }
        }

        System.out.println("---Mahasiswa dengan IPK Tertinggi---");
        mahasiswaTertinggi.tampilkanData();
    }
}
