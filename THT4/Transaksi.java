public class Transaksi{
    String idTransaksi;
    Pelanggan pelanggan;
    Produk produk;
    int jumlahBeli;
    double totalHarga;

    public Transaksi(String idTransaksi, Pelanggan pelanggan, Produk produk, int jumlahBeli){
        this.idTransaksi = idTransaksi;
        this.pelanggan = pelanggan;
        this.produk = produk;
        this.jumlahBeli = jumlahBeli;
    }

    public void prosesTransaksi(){
        if(pelanggan.saldo >= produk.harga){
            if(produk.stok > 0){
                produk.kurangiStok(jumlahBeli);
                pelanggan.kurangiSaldo(produk.harga * jumlahBeli);
            }
            else{
                System.out.println("Error: Stok kosong");
            }
        }
        else{
            System.out.println("Error: Saldo tidak cukup");
        }
    }

    public void tampilkanDetailTransaksi(){
        System.out.println("\n--- Informasi Transaksi ---");
        System.out.println("Nama produk: " + produk.namaProduk);
        System.out.println("Jumlah yang dibeli: " + jumlahBeli);
        System.out.println("Total harga: Rp " + (int) Math.round(produk.harga * jumlahBeli));
    }
}