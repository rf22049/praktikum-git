import java.util.Scanner;
public class Core{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu = 0;
        int tambahSaldo = 0;
        Pelanggan customer = new Pelanggan("000", "V", "no email", 100000);
        Produk product1 = new Produk("123", "Makanan", 5000, 10);
        Produk product2 = new Produk("456", "Minuman", 2500, 5);
        Produk product3 = new Produk("789", "Makanan & Minuman", 6000, 0);
        System.out.println("\n--- Informasi Produk ---");
        System.out.println("Produk 1:");
        product1.tampilkanInfoProduk();
        System.out.println("------");
        System.out.println("Produk 2:");
        product2.tampilkanInfoProduk();
        System.out.println("------");
        System.out.println("Produk 3:");
        product3.tampilkanInfoProduk();

        while (menu != 4){
        System.out.println("\n--- Menu Pembelanjaan ---");
        System.out.println("1. Tampilkan info pribadi");
        System.out.println("2. Tambahkan saldo");
        System.out.println("3. Beli produk");
        System.out.println("4. Exit");
        System.out.print("Pilihan menu: ");
        menu = input.nextInt();

        switch(menu){
            case 1:
            customer.tampilkanInfoPelanggan();
            break;
            case 2:
            System.out.print("Masukkan jumlah saldo yang ingin ditambahkan: Rp ");
            tambahSaldo = input.nextInt();
            customer.topUpSaldo((int) Math.round(tambahSaldo));
            break;
            case 3:
            System.out.print("Pilih produk yang ingin dibeli: ");
            int pilihProduk = input.nextInt();
            if (pilihProduk == 1){
                Transaksi beli = new Transaksi("000", customer, product1, 0);
                System.out.print("Masukkan jumlah barang yang ingin dibeli: ");
                beli.jumlahBeli = input.nextInt();
                beli.prosesTransaksi();
                beli.tampilkanDetailTransaksi();
            }
            else if (pilihProduk == 2){
                Transaksi beli = new Transaksi("000", customer, product2, 0);
                System.out.print("Masukkan jumlah barang yang ingin dibeli: ");
                beli.jumlahBeli = input.nextInt();
                beli.prosesTransaksi();
                beli.tampilkanDetailTransaksi();
            }
            else if (pilihProduk == 3){
                Transaksi beli = new Transaksi("000", customer, product2, 0);
                System.out.print("Masukkan jumlah barang yang ingin dibeli: ");
                beli.jumlahBeli = input.nextInt();
                beli.prosesTransaksi();
                beli.tampilkanDetailTransaksi();
            }
            break;
            case 4:
            System.out.println("\n--- Terima Kasih Banyak ---");
            break;
            default:
            System.out.println("Error...");
            menu = 4;
            break;
        }
        }

    }
}