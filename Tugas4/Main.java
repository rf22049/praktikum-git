public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("B 123 ABC", "Toyota", 50000);

        Pelanggan orang1 = new Pelanggan("Budi", 123456789, 812345678);

        mobil1.infoMobil();
        System.out.println("\n--- Proses Penyewaan ---");

        Sewa sewa1 = new Sewa(orang1, mobil1, 3);

        sewa1.rent();

        System.out.println("\n--- Informasi Setelah Penyewaan ---");
        sewa1.infoRent();

        System.out.println("\n--- Status Mobil Setelah Disewa ---");
        mobil1.infoMobil();
    }
}