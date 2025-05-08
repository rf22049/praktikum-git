package week08.PostTest;

class Bangunan{
    String nama = "Bangunan Umum";
}

class GedungSekolah extends Bangunan{
    String nama = "Gedung Sekolah ABC";

    void tampilkanInfo(){
        System.out.println("Nilai nama milik subclass: " + nama);
        System.out.println("Nilai nama milik superclass: " + super.nama);
    }
}

public class PostTest1 {
    public static void main(String[] args) {
        GedungSekolah gedung = new GedungSekolah();
        gedung.tampilkanInfo();
    }
}
