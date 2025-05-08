package week08;

class Kendaraan{
    Kendaraan(){
        System.out.println("Konstruktor Kendaraan dipanggil");
    }
}

class Mobil extends Kendaraan{
    Mobil(){
        super();
        System.out.println("Konstruktor Mobil dipanggil");
    }
}

public class AppMain {
    public static void main(String[] args) {
        Mobil jazz = new Mobil();
    }
}
