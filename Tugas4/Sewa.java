public class Sewa {
    Pelanggan pelanggan;
    Mobil mobil;
    int hariSewa;

    Sewa(Pelanggan pelanggan, Mobil mobil, int hariSewa){
        this.pelanggan = pelanggan;
        this.mobil = mobil;
        this.hariSewa = hariSewa;
    }

    void rent(){
        if (mobil.getStatusMobil() == true){
            mobil.menyewa();
        }
        else{
            mobil.kembalikan();
        }
    }

    void infoRent(){
        pelanggan.infoPelanggan();
        mobil.infoMobil();
        System.out.println("Lama sewa mobil: " + hariSewa + " hari");
        System.out.println("Total biaya sewa: Rp" + mobil.getHargaSewa() * hariSewa);
    }
}
