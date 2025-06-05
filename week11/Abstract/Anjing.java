package week11.Abstract;

public class Anjing extends Hewan {

    @Override
    void bersuara() {
        System.out.println(nama + " bersuara gong");
    }

    Anjing(String nama) {
        super(nama);
    }
}
