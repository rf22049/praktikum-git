package week10.THT;

public class Main {
    public static void main(String[] args) {
        Transportasi[] transports = new Transportasi[3];
        transports[0] = new Bus("Bus", 40, "Bandung");
        transports[1] = new Kereta("Kereta", 60, "Surabaya");
        transports[2] = new Pesawat("Pesawat", 150, "Medan");

        Bus bus = (Bus) transports[0];
        System.out.println(bus.getNama() + " ke " + bus.getTujuan());
        System.out.println("Harga tiket (default): " + bus.hitungHargaTiket());
        System.out.println("Harga tiket (Bisnis): " + bus.hitungHargaTiket("Bisnis"));
        System.out.println();

        Kereta kereta = (Kereta) transports[1];
        System.out.println(kereta.getNama() + " ke " + kereta.getTujuan());
        System.out.println("Harga tiket (default): " + kereta.hitungHargaTiket());
        System.out.println("Harga tiket (VIP): " + kereta.hitungHargaTiket("VIP"));
        System.out.println();

        Pesawat pesawat = (Pesawat) transports[2];
        System.out.println(pesawat.getNama() + " ke " + pesawat.getTujuan());
        System.out.println("Harga tiket (default): " + pesawat.hitungHargaTiket());
        System.out.println("Harga tiket (Ekonomi): " + pesawat.hitungHargaTiket("Ekonomi"));
        System.out.println();
    }
}