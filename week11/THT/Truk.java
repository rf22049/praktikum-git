package week11.THT;

public class Truk extends Kendaraan implements DapatDisewa, Muatan {
    private int kapasitasMuatan;

    public Truk(int platNomor, String merk, int tahunProduksi, int kapasitasMuatan) {
        super(platNomor, merk, tahunProduksi);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kapasitas Muatan: " + kapasitasMuatan + " kg");
    }

    @Override
    public void hitungBiayaSewa(int hari) {
        int biayaSewa = 500000 * hari;
        System.out.println("Biaya Sewa Truk untuk " + hari + " hari: Rp " + biayaSewa);
    }

    @Override
    public void perluSupir() {
        System.out.println("Truk ini memerlukan supir untuk mengemudikannya");
    }

    @Override
    public void kapasitasMuatan() {
        System.out.println("Kapasitas muatan truk ini adalah " + kapasitasMuatan + " kg");
    }
    
}
