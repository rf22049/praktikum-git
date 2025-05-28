package week10.THT;

class Bus extends Transportasi {
    public Bus(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.10;
    }

    public double hitungHargaTiket(String kelasLayanan) {
        double hargaDasar = hitungHargaTiket();
        if (kelasLayanan == "Ekonomi") {
            return hargaDasar;
        } else if (kelasLayanan == "Bisnis") {
            return hargaDasar * 1.25;
        } else if (kelasLayanan == "VIP") {
            return hargaDasar * 1.50;
        }
        return hargaDasar;
    }
}