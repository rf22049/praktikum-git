package week11.Interface;

public class Mobil extends Pemilik implements Kendaraan, Pabrik {

    Mobil(String nama) {
        super(nama);
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin mobil dinyalakan");
    }

    @Override
    public void matikanMesin() {
        System.out.println("Mesin mobil dimatikan");
    }

    @Override
    public void produksiKendaraan() {
        System.out.println("Mobil diproduksi");
    }

    @Override
    public void pemilikKendaraan(String namaPemilik){
        System.out.println(namaPemilik + " adalah pemilik mobil " + nama);
    }
}
