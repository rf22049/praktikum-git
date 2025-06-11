package week11.THT;

public abstract class Kendaraan{
    public int platNomor;
    public String merk;
    public int tahunProduksi;

    public Kendaraan(int platNomor, String merk, int tahunProduksi) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    public void tampilkanInfo(){
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }

    public abstract void hitungBiayaSewa(int hari);
    public abstract void perluSupir();
}