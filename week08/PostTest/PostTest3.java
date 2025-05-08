package week08.PostTest;

class Produk{
    int harga = 10000;
}

class Buku extends Produk{
    int harga = 25000;

    void bandingkanHarga(){
        System.out.println("Harga Buku: " + harga);
        System.out.println("Harga Produk: " + super.harga);
    }
}

public class PostTest3 {
    public static void main(String[] args) {
        Buku buku = new Buku();
        buku.bandingkanHarga();
    }
}