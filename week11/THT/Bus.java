package week11.THT;

public class Bus extends Kendaraan implements DapatDisewa{
    public Bus(int platNomor, String merk, int tahunProduksi) {
        super(platNomor, merk, tahunProduksi);
    }

    @Override
    public void hitungBiayaSewa(int hari) {
        System.out.println("Biaya sewa bus untuk " + hari + " hari: Rp " + (hari * 1000000));
    }

    @Override
    public void perluSupir() {
        System.out.println("Bus perlu supir");
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Kendaraan: Bus");
    }
}
