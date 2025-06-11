package week11.THT;

public class MobilPribadi extends Kendaraan implements DapatDisewa {
    public MobilPribadi(int platNomor, String merk, int tahunProduksi) {
        super(platNomor, merk, tahunProduksi);
    }

    @Override
    public void hitungBiayaSewa(int hari) {
        System.out.println("Biaya sewa mobil pribadi untuk " + hari + " hari: Rp " + (hari * 500000));
    }

    @Override
    public void perluSupir() {
        System.out.println("Mobil pribadi tidak perlu supir");
    }
}
