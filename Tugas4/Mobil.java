public class Mobil {
    private String nomorPlat;
    private String merk;
    private int hargaSewa;
    private boolean statusMobil;

    Mobil(String nomorPlat, String merk, int hargaSewa) {
        this.nomorPlat = nomorPlat;
        this.merk = merk;
        this.hargaSewa = hargaSewa;
        this.statusMobil = true;
    }

    String getNomorPlat(){
        return nomorPlat;
    }

    String getMerk(){
        return merk;
    }

    int getHargaSewa(){
        return hargaSewa;
    }

    boolean getStatusMobil(){
        return statusMobil;
    }

    void infoMobil(){
        System.out.println("Merk mobil: " + merk);
        System.out.println("Nomor plat mobil: " + nomorPlat);
        System.out.println("Harga sewa mobil per hari: Rp" + hargaSewa);
        if (statusMobil) {
            System.out.println("Status sewa mobil: tersedia");
        }
        else{
            System.out.println("Status sewa mobil: sedang disewa");
        }
    }

    void menyewa(){
        if (statusMobil) {
            statusMobil = false;
        }
        else{
            System.out.println("Mobil " + nomorPlat + " sedang tidak tersedia.");
        }
    }

    void kembalikan(){
        statusMobil = true;
    }
}