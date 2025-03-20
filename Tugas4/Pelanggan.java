public class Pelanggan {
    private String namaPelanggan;
    private int noKTP;
    private int noHP;

    Pelanggan(String namaPelanggan, int noKTP, int noHP){
        this.namaPelanggan = namaPelanggan;
        this.noKTP = noKTP;
        this.noHP = noHP;
    }

    String getNamaPelanggan(){
        return namaPelanggan;
    }

    int getNoKTP(){
        return noKTP;
    }

    int getNoHP(){
        return noHP;
    }

    void infoPelanggan(){
        System.out.println("Nama pelanggan: " + namaPelanggan);
        System.out.println("Nomor KTP pelanggan: " + noKTP);
        System.out.println("Nomor telepon pelanggan: " + noHP);
    }
}
