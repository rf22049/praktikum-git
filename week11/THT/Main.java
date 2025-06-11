package week11.THT;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(123, "bus", 1850);
        MobilPribadi mobil = new MobilPribadi(321, "mobil", 2000);
        Truk truk = new Truk(213, "truk", 1775, 1000);

        bus.tampilkanInfo();
        bus.hitungBiayaSewa(5);
        mobil.tampilkanInfo();
        mobil.hitungBiayaSewa(3);
        truk.tampilkanInfo();
        truk.hitungBiayaSewa(7);
    }
}
