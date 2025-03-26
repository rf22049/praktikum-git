public class Produk{
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    public Produk(String kodeProduk, String namaProduk, double harga, int stok){
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanInfoProduk(){
        System.out.println("Nama produk: " + namaProduk);
        System.out.println("Kode produk: " + kodeProduk);
        System.out.println("Harga produk: " + (int) Math.round(harga));
        System.out.println("Stok Produk: " + stok + " buah");
    }

    public void kurangiStok(int jumlah){
        stok = stok - jumlah;
    }
}