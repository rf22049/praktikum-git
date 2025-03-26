public class Pelanggan{
    String idPelanggan;
    String nama;
    String email;
    double saldo;

    public Pelanggan(String idPelanggan, String nama, String email, double saldo){
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.email = email;
        this.saldo = saldo;
    }

    public void tampilkanInfoPelanggan(){
        System.out.println("ID pelanggan: " + idPelanggan);
        System.out.println("Nama pelanggan: " + nama);
        System.out.println("Email pelanggan: " + email);
        System.out.println("Saldo pelanggan: Rp " + (int) Math.round(saldo));
    }

    public void topUpSaldo(double jumlah){
        saldo += jumlah;
    }

    public void kurangiSaldo(double jumlah){
        saldo = saldo - jumlah;
    }
}